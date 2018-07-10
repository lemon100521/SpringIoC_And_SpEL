package com.dyy.springcore.common.impl;

import com.dyy.springcore.common.Shape;

public class Triangle implements Shape {

    private final double A;
    private final double B;
    private final double C;

    public Triangle(double a, double b, double c) {
        A = a;
        B = b;
        C = c;
    }


    public double computeArea() {
        double q = (this.computeSide())/2;
        return Math.sqrt((q-A)*(q-B)*(q-C)*q);
    }

    public double computeSide() {
        return (this.A + this.B + this.C);
    }

    public double getA() {
        return A;
    }

    public double getB() {
        return B;
    }

    public double getC() {
        return C;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "A=" + A +
                ", B=" + B +
                ", C=" + C +
                ",area="+this.computeArea()+
                ",side="+this.computeSide()+
                '}';
    }
}
