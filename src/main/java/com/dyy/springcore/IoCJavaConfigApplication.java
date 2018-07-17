package com.dyy.springcore;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class IoCJavaConfigApplication {

    @Bean
    public String hello(){
        return "hello";
    }
}
