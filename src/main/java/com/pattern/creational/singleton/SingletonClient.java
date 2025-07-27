package com.pattern.creational.singleton;

public class SingletonClient {
    public static void main(String[] args) {

        Runnable runnable = () -> {
            ChocolateBoiler chocolateBoiler = ChocolateBoiler.getUniqueInstance();
            System.out.println("Instance id "+ chocolateBoiler.hashCode());
            chocolateBoiler.fill();
            chocolateBoiler.boiled();
        };

        for (int i = 0; i < 10; i++) {
            runnable.run();
        }


    }
}
