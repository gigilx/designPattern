package com.lx.pattern.create.factory.factory;

public class LatteCoffeeFactory implements Factory{
    @Override
    public Coffee creatCoffee() {
        return new LatteCoffee();
    }
}
