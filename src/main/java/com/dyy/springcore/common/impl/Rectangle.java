package com.dyy.springcore.common.impl;

import com.dyy.springcore.common.Shape;

public class Rectangle implements Shape {

    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double computeArea() {
       return this.height * this.width;
    }

    public double computeSide() {
       return 2 * (this.width + this.height);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ",area="+this.computeArea()+
                ",side="+this.computeSide()+
                '}';
    }
}
