package com.lx.pattern.factory.abstractFactory;

public class Demo {
    public static void main(String[] args) {
        AmericanFactory factory = new AmericanFactory();
        CoffeeStore coffeeStore = new CoffeeStore();
        coffeeStore.setFactory(factory);
        Coffee coffee = coffeeStore.orderCoffee();
        System.out.println(coffee.getName());
        Dessert dessert = coffeeStore.orderDessert();
        dessert.show();
    }
}
