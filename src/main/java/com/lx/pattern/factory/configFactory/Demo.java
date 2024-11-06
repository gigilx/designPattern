package com.lx.pattern.factory.configFactory;

public class Demo {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Coffee coffee = factory.createCoffee("american");
        System.out.println(coffee.getName());
    }
}
