package com.dyy.springcore.auto;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.time.LocalDate;

@Component
@Scope(value = "prototype")
public class ChineseCurrence {

    public ChineseCurrence() {
        System.out.println("构造方法");
    }
    public LocalDate localDateTime(){
        return LocalDate.now();
    }
    @PostConstruct
    public void init(){
        System.out.println("对象实例化完成后执行");
    }
    @PreDestroy
    public void destory(){
        System.out.println("对象销毁前执行");
    }
}
