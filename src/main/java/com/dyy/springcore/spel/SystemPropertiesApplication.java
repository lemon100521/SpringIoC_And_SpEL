package com.dyy.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.Properties;

public class SystemPropertiesApplication {
    public static void main(String[] args) {

//        ApplicationContext context = new ClassPathXmlApplicationContext("properties-content.xml");
//        SystemPropertiesBean systemPropertiesBean = (SystemPropertiesBean) context.getBean("systemPropertiesBean");
//        System.out.println(systemPropertiesBean);


//          ApplicationContext context = new ClassPathXmlApplicationContext("properties-content.xml");
//          SystemEnvirmentBean systemEnvirmentBean = context.getBean(SystemEnvirmentBean.class);
//          System.out.println(systemEnvirmentBean);

        ApplicationContext context = new ClassPathXmlApplicationContext("properties-content.xml");
        MyDataSource myDataSource = context.getBean(MyDataSource.class);
        System.out.println(myDataSource);



    }
}
