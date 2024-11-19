package com.lx.pattern.create.factory.factory;

/**
 * 满足了开闭原则
 * 但是增加了系统复杂度
 */
public interface Factory {
    Coffee creatCoffee();
}
