package com.lx.pattern.factory.factory;

public class LatteCoffee extends Coffee {
    @Override
    public String getName() {
        return "拿铁咖啡";
    }

    public void addMilk() {
        System.out.println("加奶");
    }
}
