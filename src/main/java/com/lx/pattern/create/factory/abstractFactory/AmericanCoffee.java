package com.lx.pattern.create.factory.abstractFactory;

public class AmericanCoffee extends Coffee {
    public String getName()
    {
        return "美式咖啡";
    }

    public void addSugar() {
        System.out.println("加糖");
    }
}
