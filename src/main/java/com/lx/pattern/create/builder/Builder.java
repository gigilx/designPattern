package com.lx.pattern.create.builder;

public abstract class Builder {

    protected Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    public  Bike createBike(){
        return bike;
    }
}
