package com.dyy.springcore.auto;

import com.dyy.springcore.ExampleBean4;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.CountDownLatch;

/**
*@Description: 此类用于多线程下自定义作用域的验证
*@Author： dyy
*/
public class IoCAutoApplication {
    public static void main(String[] args) {
        final  ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-content.xml");
        //此语句是使用代码注册方式定义作用域，与使用XML进行配置具有等同效果
        //        context.getBeanFactory().registerScope("thread",new SingleThreadScope());
        final int count = 3;
        final CountDownLatch countDownLatch = new CountDownLatch(count);
        for(int i = 0; i < count ; i++) {
            new Thread(new Runnable() {
                public void run() {
                    ExampleBean4 exampleBean4 = (ExampleBean4) context.getBean("bean44");
                    System.out.println("currentThread " + Thread.currentThread().getName() + " " + exampleBean4.hashCode());
                    countDownLatch.countDown();
                }
            }).start();
        }
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
}
