package com.pattern.creational.singleton;

public class ChocolateBoiler {
    private static ChocolateBoiler uniqueInstance;
    private boolean empty = true;

    public static ChocolateBoiler getUniqueInstance() {
        if(uniqueInstance == null){
            synchronized (ChocolateBoiler.class) {
                if(uniqueInstance == null) {
                    uniqueInstance = new ChocolateBoiler();
                }
            }
        }
        return uniqueInstance;
    }

    public void fill(){
        if (empty) {
            System.out.println("Filling the boiler with Milk and Chocolate");
            empty = false;
        }
    }

    public void boiled(){
        if(!empty){
            System.out.println("Start boiling");
            empty = true;
        }
    }
}
