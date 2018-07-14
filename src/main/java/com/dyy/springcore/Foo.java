package com.dyy.springcore;

public class Foo {

    private final Bar bar;
    private final Baz baz;
    public Foo(Bar bar, Baz baz) {
        this.bar = bar;
        this.baz = baz;
    }

    @Override
    public String toString() {
        return "Foo{" +
                "bar=" + bar +
                ", baz=" + baz +
                '}';
    }
}
