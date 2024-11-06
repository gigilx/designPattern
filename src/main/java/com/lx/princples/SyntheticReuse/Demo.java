package com.lx.princples.SyntheticReuse;

public class Demo {
    public static void main(String[] args) {
        Car car = new ElecCar();
        car.setColor(new White());
        car.drive();

    }
}
