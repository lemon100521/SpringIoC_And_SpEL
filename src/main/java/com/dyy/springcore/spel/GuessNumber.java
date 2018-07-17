package com.dyy.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.awt.AppContext;

public class GuessNumber {
    private double num;

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "GuessNumber{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-content.xml");
        GuessNumber guessNumber = (GuessNumber) context.getBean("guessNumber");
        for (int i = 0;i <10;i++){
            System.out.println(guessNumber.hashCode());
        }
    }
}
