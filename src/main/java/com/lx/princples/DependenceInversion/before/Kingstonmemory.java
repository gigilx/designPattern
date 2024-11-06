package com.lx.princples.DependenceInversion.before;

public class Kingstonmemory {
    public void save(String data) {
        System.out.println("使用金士顿内存条存储");
    }

    public String read() {
        System.out.println("从金士顿内存条中获取数据");
        return "data";
    }
}
