package com.lx.pattern.factory.abstractFactory;

public class ItalyFactory implements Factory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Mochamosse();
    }
}
