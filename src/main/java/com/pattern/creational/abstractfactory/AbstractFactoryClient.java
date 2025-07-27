package com.pattern.creational.abstractfactory;

public class AbstractFactoryClient {

    public static void main(String[] args) {
        FurnitureFactory furnitureFactory = new VictorianFurnitureFactory();
        Sofa sofa = furnitureFactory.createSofa();
        sofa.build();
        Chair chair = furnitureFactory.createChair();
        chair.build();

        furnitureFactory = new ModernFurnitureFactory();
        sofa = furnitureFactory.createSofa();
        sofa.build();
        chair = furnitureFactory.createChair();
        chair.build();

    }
}
