package com.dyy.springcore.common.impl;

import com.dyy.springcore.common.Shape;

public class Circle implements Shape {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double computeArea() {
        return Math.PI * Math.pow(this.radius,2);
    }

    public double computeSide() {
        return 2 * Math.PI * this.radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "area="+this.computeArea()+
                "side="+this.computeSide()+
                '}';
    }
}
