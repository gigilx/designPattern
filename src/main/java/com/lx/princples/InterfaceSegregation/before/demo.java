package com.lx.princples.InterfaceSegregation.before;

public class demo {
    public static void main(String[] args) {
        SafeDoor safeDoor = new HeimaSafeDoor();
        safeDoor.fireproof();
        safeDoor.waterproof();
        safeDoor.antiTheft();
    }
}
