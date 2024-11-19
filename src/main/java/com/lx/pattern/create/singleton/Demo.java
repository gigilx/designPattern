package com.lx.pattern.create.singleton;

public class Demo {
    public static void main(String[] args) {
        HungrySingleton instance = HungrySingleton.getInstance();
        HungrySingleton instance2 = HungrySingleton.getInstance();
        System.out.println(instance == instance2);

        LazySingleton2  instance3 = LazySingleton2.getInstance();
        LazySingleton2  instance4 = LazySingleton2.getInstance();
        System.out.println(instance3 == instance4);

    }
}
