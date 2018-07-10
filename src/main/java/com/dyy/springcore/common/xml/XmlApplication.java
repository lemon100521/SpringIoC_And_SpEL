package com.dyy.springcore.common.xml;

import com.dyy.springcore.common.Shape;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-content.xml");
        XmlShapeCompute compute = (XmlShapeCompute) context.getBean("compute");
        Shape shape = compute.computeShape("circle");
        System.out.println(shape);
    }
}
