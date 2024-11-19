package com.lx.pattern.create.singleton;

/**
 * 饿汉式单例-静态代码块
 */
public class HungrySingleton2 {
    private static HungrySingleton2 instance ;

    static {
        instance = new HungrySingleton2();
    }

    private HungrySingleton2() {

    }

    public static HungrySingleton2 getInstance() {
        return instance;
    }
}
