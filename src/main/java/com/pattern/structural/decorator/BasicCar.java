package com.pattern.structural.decorator;

public class BasicCar implements Car{

    @Override
    public void assembly() {
        System.out.print("Assemble " + description() + " car" );
    }

    @Override
    public String description() {
        return "Basic";
    }
}
