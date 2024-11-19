package com.lx.pattern.create.singleton;

/**
 * 懒汉式-双重检查锁-单例模式比较好的实践方式
 * 直接加锁会导致性能问题
 */
public class LazySingleton2 {

    //保证在多线程情况下不会出现空指针的问题
    private volatile static LazySingleton2 instance;

    private LazySingleton2() {

    }

    public synchronized static LazySingleton2 getInstance() {
        if (instance == null) {
           synchronized(LazySingleton2.class) {
               if (instance == null) {
                   instance = new LazySingleton2();
               }
            }
        }
        return instance;
    }

}