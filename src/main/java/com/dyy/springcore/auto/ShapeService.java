package com.dyy.springcore.auto;

import com.dyy.springcore.Shape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ShapeService {

    @Autowired
    @Qualifier(value = "triangle")
    private Shape shape;

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public Shape getShape() {
        return shape;
    }

    @Override
    public String toString() {
        return "ShapeService{" +
                "shape=" + shape +
                '}';
    }
}
