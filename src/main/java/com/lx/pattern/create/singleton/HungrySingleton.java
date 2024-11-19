package com.lx.pattern.create.singleton;

/**
 * 饿汉式单例-静态变量
 */
public class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
