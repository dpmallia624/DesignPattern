package com.pattern.creational.abstractfactory;

public class ModernChair implements Chair {
    @Override
    public void build() {
        System.out.println("Modern Chair");
    }
}
