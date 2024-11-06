package com.lx.princples.OpenAndClose;

public class Client {
    public static void main(String[] args) {
        SoGouInput input = new SoGouInput();
        AbstractSkin skin = new HeimaSkin();
        input.setSkin(skin);
        input.input();
    }
}
