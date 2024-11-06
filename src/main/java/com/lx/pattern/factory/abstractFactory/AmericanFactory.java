package com.lx.pattern.factory.abstractFactory;

public class AmericanFactory implements Factory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Tiramishu();
    }
}
