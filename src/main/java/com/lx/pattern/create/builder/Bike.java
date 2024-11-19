package com.lx.pattern.create.builder;

public class Bike {

    private String frame; //车架
    private String seat;  //车座

    public Bike()
    {
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
}
