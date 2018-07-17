package com.dyy.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
*@Description: 此类用于基于注解的配置类
*@Author： dyy
*@CreateDate：7-17
*/
@Component
public class SystemEnvirmentBean {

    @Value(value = "#{properties['url']}")
    private String url;
    @Value(value = "#{properties['classname']}")
    private String classname;
    @Value(value = "#{properties['username']}")
    private String username;
    @Value(value = "#{properties['password']}")
    private String password;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "SystemEnvirmentBean{" +
                "url='" + url + '\'' +
                ", classname='" + classname + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
