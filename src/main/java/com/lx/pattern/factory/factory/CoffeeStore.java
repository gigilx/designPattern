package com.lx.pattern.factory.factory;

import com.lx.pattern.factory.simpleFactory.SimpleFactory;

public class CoffeeStore {
    private Factory factory;

    public void setFactory(Factory factory) {
        this.factory = factory;
    }
    public Coffee orderCoffee() {
        return factory.creatCoffee();
    }
}
