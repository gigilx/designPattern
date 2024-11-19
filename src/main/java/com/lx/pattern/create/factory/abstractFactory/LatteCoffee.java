package com.lx.pattern.create.factory.abstractFactory;

public class LatteCoffee extends Coffee {
    @Override
    public String getName() {
        return "拿铁咖啡";
    }

    public void addMilk() {
        System.out.println("加奶");
    }
}
