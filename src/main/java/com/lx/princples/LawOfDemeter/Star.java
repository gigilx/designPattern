package com.lx.princples.LawOfDemeter;

public class Star {
    private String name;
    
    public Star(String name) {
        this.name = name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
