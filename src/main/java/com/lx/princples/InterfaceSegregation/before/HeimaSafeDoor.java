package com.lx.princples.InterfaceSegregation.before;

public class HeimaSafeDoor implements SafeDoor{
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
