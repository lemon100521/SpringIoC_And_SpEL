package com.dyy.springcore.auto;

import com.dyy.springcore.Bar;

public class Customer2 {
    private Bar bar;

    public Bar getBar() {
        return bar;
    }

    public void setBar(Bar bar) {
        this.bar = bar;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "bar=" + bar +
                '}';
    }
}
