package com.lx.princples.InterfaceSegregation.after;

public class demo {
    public static void main(String[] args) {
        HeimaSafeDoor safeDoor = new HeimaSafeDoor();
        safeDoor.fireproof();
        safeDoor.waterproof();
        safeDoor.antiTheft();
    }
}
