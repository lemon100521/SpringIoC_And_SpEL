package com.dyy.springcore;

public class ExampleBean3 {
    private final String name;
    private final int id;

    public ExampleBean3(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ExampleBean3{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
