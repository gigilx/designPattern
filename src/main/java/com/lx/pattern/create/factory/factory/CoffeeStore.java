package com.lx.pattern.create.factory.factory;

public class CoffeeStore {
    private Factory factory;

    public void setFactory(Factory factory) {
        this.factory = factory;
    }
    public Coffee orderCoffee() {
        return factory.creatCoffee();
    }
}
