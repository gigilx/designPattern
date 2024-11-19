package com.lx.pattern.create.singleton;

import java.io.Serializable;

/**
 *静态内部类实现单例模式
 * Java在加载类的时候不会加载内部类
 * 序列化和反序列化可以破坏单例模式
 */
public class StaticInternalSingleton implements Serializable {
    private StaticInternalSingleton(){

    }

    private static class SingletonHolder{
        private static final StaticInternalSingleton INSTANCE = new StaticInternalSingleton();
    }

    public static StaticInternalSingleton getInstance(){
        return  SingletonHolder.INSTANCE;
    }

    //当调用反序列化时，会自动调用该方法，就不会被序列化破坏单例模式了
    public Object readResolve(){
        return SingletonHolder.INSTANCE;
    }
}
