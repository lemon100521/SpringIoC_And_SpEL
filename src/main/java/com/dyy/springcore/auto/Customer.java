package com.dyy.springcore.auto;

import com.dyy.springcore.Bar;

public class Customer {
    private final Bar bar;

    public Customer(Bar bar) {
        this.bar = bar;
    }

    public Bar getBar() {
        return bar;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "bar=" + bar +
                '}';
    }
}
