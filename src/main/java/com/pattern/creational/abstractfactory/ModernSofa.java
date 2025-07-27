package com.pattern.creational.abstractfactory;

public class ModernSofa implements Sofa {
    @Override
    public void build() {
        System.out.println("Modern sofa");
    }
}
