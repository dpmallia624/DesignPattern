package com.pattern.creational.factorymethod;

public class FactoryMethodClient {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new StandardShapeFactory();
        shapeFactory.getShape("circle").draw();
        shapeFactory.getShape("rectangle").draw();
        shapeFactory.getShape("square").draw();
    }
}
