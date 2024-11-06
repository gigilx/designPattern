package com.lx.princples.InterfaceSegregation.after;

public class HeimaSafeDoor implements AntiTheftSafeDoor, WaterproofSafeDoor, FireproofSafeDoor {
    public void antiTheft()
    {
        System.out.println("防盗");
    }

    public void waterproof() {
        System.out.println("防水");
    }

    public void fireproof(){
        System.out.println("防火");
    }

}
