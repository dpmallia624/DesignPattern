package com.pattern.creational.abstractfactory;

public class VictorianChair implements Chair {
    @Override
    public void build() {
        System.out.println("Victorian Chair");
    }
}
