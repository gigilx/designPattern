package com.lx.pattern.factory.abstractFactory;

public class CoffeeStore {
    private Factory factory;

    public void setFactory(Factory factory) {
        this.factory = factory;
    }
    public Coffee orderCoffee() {
        return factory.createCoffee();
    }

    public Dessert orderDessert() {
        return factory.createDessert();
    }
}
