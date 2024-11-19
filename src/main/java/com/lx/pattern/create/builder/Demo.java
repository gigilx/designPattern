package com.lx.pattern.create.builder;

public class Demo {
    public static void main(String[] args) {
        Builder builder = new OfoBuilder();
        Director director = new Director(builder);
        Bike bike = director.construct();
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }
}
