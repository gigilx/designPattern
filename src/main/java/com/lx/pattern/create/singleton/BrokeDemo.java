package com.lx.pattern.create.singleton;

import java.lang.reflect.Constructor;

/**
 * 反射可以破坏单例模式
 */
public class BrokeDemo {
    public static void main(String[] args) {
        Class clazz = HungrySingleton.class;
        try {
            Constructor cons = clazz.getDeclaredConstructor();
            cons.setAccessible(true);
            HungrySingleton instance1 = (HungrySingleton) cons.newInstance();
            HungrySingleton instance2 = (HungrySingleton) cons.newInstance();
            System.out.println(instance1 == instance2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
