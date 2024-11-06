package com.lx.princples.OpenAndClose;

public class SoGouInput {
    private AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    public void input() {
        skin.display();
    }

}
