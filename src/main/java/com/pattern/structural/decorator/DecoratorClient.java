package com.pattern.structural.decorator;

public class DecoratorClient {

    public static void main(String[] args) {
        System.out.println("\n------Basic car-------------");
        Car basicCar = new BasicCar();
        basicCar.assembly();

        System.out.println("\n------Sport car-------------");
        Car sportCar = new SportCar(new BasicCar());
        sportCar.assembly();

        System.out.println("\n------Luxury car-------------");
        Car luxuryCar = new LuxuryCar(new BasicCar());
        luxuryCar.assembly();

        System.out.println("\n------Sport and Luxury -------------");
        Car sportLuxuryCar = new SportCar(new LuxuryCar(new BasicCar()));
        sportLuxuryCar.assembly();
    }
}
