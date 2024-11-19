package com.lx.pattern.create.builder.extend;

public class Demo {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .cpu("Intel")
                .mainboard("华硕")
                .memory("金士顿")
                .build();
        System.out.println(computer);

    }
}
