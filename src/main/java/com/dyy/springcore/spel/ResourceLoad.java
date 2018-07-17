package com.dyy.springcore.spel;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;

import java.io.*;
import java.net.MalformedURLException;


public class ResourceLoad {
    public static Resource loadResource(String fileName){
        if(fileName==null||fileName.length()==0){
            return  null;
        }
        if(fileName.startsWith("file:")){
            return new FileSystemResource(fileName.substring("file:".length()));
        }
        if(fileName.startsWith("classpath")){
            return new ClassPathResource(fileName.substring("classpath:".length()));
        }
        if(fileName.startsWith("http")||fileName.startsWith("https")||fileName.startsWith("ftp")){
            try {
                return new UrlResource(fileName);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static void writeToDirection(Resource resource){
        File file = new File("D:\\data.properties");
        FileOutputStream fileOutputStream = null;
        InputStream inputStream = null;
        try {
            inputStream = resource.getInputStream();
            fileOutputStream = new FileOutputStream("file");
            int len = 0;
            byte[] data = new byte[1024];
            while ((len = inputStream.read())!=-1){
                fileOutputStream.write(data,0,len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileOutputStream.close();
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
    public static void main(String[] args) {
       // System.out.println(loadResource("file:C:\\Users\\lenovo\\Desktop\\database.properties"));
        Resource resource = loadResource("classpath:database.properties");
        writeToDirection(resource);
    }
}
