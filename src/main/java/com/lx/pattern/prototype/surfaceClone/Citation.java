package com.lx.pattern.prototype.surfaceClone;

public class Citation implements Cloneable{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Citation(){
        System.out.println("citation对象创建了。。。");
    }
    @Override
    public Citation clone() throws CloneNotSupportedException {
        System.out.println("复制了一个citation对象");
        return (Citation) super.clone();
    }

    @Override
    public String toString() {
        return "Citation{" +
                "name='" + name + '\'' +
                '}';
    }
}
