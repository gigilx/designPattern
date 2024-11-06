package com.lx.pattern.factory.factory;

public class Demo {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        coffeeStore.setFactory(new AmericanCoffeeFactory());
        Coffee coffee = coffeeStore.orderCoffee();
        System.out.println(coffee.getName());
        coffeeStore.setFactory(new LatteCoffeeFactory());
        coffee = coffeeStore.orderCoffee();
        System.out.println(coffee.getName());

    }
}
