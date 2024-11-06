package com.lx.pattern.factory.factory;

public class AmericanCoffeeFactory implements Factory{
    @Override
    public Coffee creatCoffee() {
        return new AmericanCoffee();
    }
}
