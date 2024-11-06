package com.lx.pattern.singleton;

/**
 * 枚举类是线程安全的，并且只会被加载一次
 * 属于饿汉式单例模式
 */
public enum EnumSingleton {
    INSTANCE;
}
