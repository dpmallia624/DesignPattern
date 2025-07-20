package com.pattern.structural.decorator;

public class SportCar extends CarDecorator {
    public SportCar(Car car) {
        super(car);
    }

    @Override
    public void assembly() {
        super.car.assembly();
        System.out.print(", " + description());
    }

    @Override
    public String description() {
        return "sporty features";
    }
}
