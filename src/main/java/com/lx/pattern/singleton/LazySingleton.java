package com.lx.pattern.singleton;

import javax.jws.Oneway;
import java.util.concurrent.locks.Lock;

/**
 * 懒汉式-线程安全
 */
public class LazySingleton {

    private static LazySingleton instance;
    private boolean flag = false;

    private LazySingleton() {
        //避免反射破坏单例模式
        synchronized(LazySingleton.class) {
            if(flag) {
                throw new RuntimeException("不能重复创建对象");
            }
            flag = true;
        }
    }

    public synchronized static LazySingleton getInstance() {
        Object lock = new Object();
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

}
