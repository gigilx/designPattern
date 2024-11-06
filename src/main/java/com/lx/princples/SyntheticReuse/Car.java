package com.lx.princples.SyntheticReuse;

public abstract class Car {
    Color color;
    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor(){
        return color;
    }
    public abstract void drive();
}
