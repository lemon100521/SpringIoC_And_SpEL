package com.dyy.springcore.auto;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IoCAutoApplication2 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-content.xml");
        ShapeService shapeService = context.getBean(ShapeService.class);
        System.out.println(shapeService);

        ChineseCurrence chineseCurrence = context.getBean(ChineseCurrence.class);
        System.out.println(chineseCurrence);
        context.getBeanFactory().destroyBean(chineseCurrence);
    }
}
