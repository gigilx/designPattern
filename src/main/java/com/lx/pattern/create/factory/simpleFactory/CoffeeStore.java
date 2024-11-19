package com.lx.pattern.create.factory.simpleFactory;

public class CoffeeStore {
    public Coffee orderCoffee(String type) {
        SimpleFactory coffeeFactory = new SimpleFactory();
        return coffeeFactory.createCoffee(type);
    }
}
