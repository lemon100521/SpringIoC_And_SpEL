package com.dyy.springcore;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExampleBean {

    public String currentDate(){
        return new SimpleDateFormat().format(new Date());
    }
}
