package com.pattern.creational.abstractfactory;

public class VictorianSofa implements Sofa {
    @Override
    public void build() {
        System.out.println("Victorian Sofa");
    }
}
