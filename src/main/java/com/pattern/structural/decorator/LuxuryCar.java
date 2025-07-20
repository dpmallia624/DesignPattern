package com.pattern.structural.decorator;

public class LuxuryCar extends CarDecorator{

    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void assembly() {
        super.car.assembly();
        System.out.print(", " + description());
    }

    @Override
    public String description() {
        return "luxury features";
    }
}
