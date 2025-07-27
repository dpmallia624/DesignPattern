package com.pattern.creational.factorymethod;

public class StandardShapeFactory implements ShapeFactory{
    @Override
    public Shape getShape(String type) {
        switch (type){
            case "rectangle" :
                return new Rectangle();
            case "circle":
                return new Circle();
            case "square":
                return new Square();
            default:
                return null;
        }
    }
}
