package com.dyy.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
*@Description: 该类采用属性占位符$ 来进行@Value注解的配置
*@Author： dyy
*@CreateDate：7-17
*/
@Component
public class MyDataSource {
    @Value("${url}")
    private String url;
    @Value("${classname}")
    private String classname;
    @Value("${username}")
    private String username;
    @Value("${password}")
    private String password;

    @Override
    public String toString() {
        return "MyDataSource{" +
                "url='" + url + '\'' +
                ", classname='" + classname + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
