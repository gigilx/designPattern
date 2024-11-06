package com.lx.princples.DependenceInversion.after;

public class IntelCPU implements CPU{
    public void  calc() {
        System.out.println("使用英特尔CPU进行计算");
    }
}
