package com.dyy.springcore;

public class ComplexShape {

    private Shape shape;

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public Shape getShape() {
        return shape;
    }

    @Override
    public String toString() {
        return "ComplexShape{" +
                "shape=" + shape +
                '}';
    }
}
