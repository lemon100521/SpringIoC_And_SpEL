package com.dyy.springcore.common.xml;

import com.dyy.springcore.common.Shape;

public class XmlShapeCompute {

    private Shape circle;
    private Shape triangle;
    private Shape rectangle;

    public Shape getCircle() {
        return circle;
    }

    public void setCircle(Shape circle) {
        this.circle = circle;
    }

    public Shape getTriangle() {
        return triangle;
    }

    public void setTriangle(Shape triangle) {
        this.triangle = triangle;
    }

    public Shape getRectangle() {
        return rectangle;
    }

    public void setRectangle(Shape rectangle) {
        this.rectangle = rectangle;
    }

    public Shape computeShape(String shapeName){
        if(shapeName.length()==0||shapeName==null){
           throw new IllegalArgumentException("Not Found");
        }
        if(shapeName.equals("circle")){
            return circle;
        }
        if(shapeName.equals("triangle")){
            return triangle;
        }
        if(shapeName.equals("rectangle")){
            return triangle;
        }
        throw new IllegalArgumentException("Not Found:"+shapeName);
    }
}
