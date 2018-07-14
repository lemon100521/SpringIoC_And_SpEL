package com.dyy.springcore;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExampleBean2 {
    private final String name;

    public ExampleBean2(String name) {
        this.name = name;
    }
    public String currentDate(){
        return new SimpleDateFormat().format(new Date());
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "ExampleBean2{" +
                "name='" + name + '\'' +
                '}';
    }
}
