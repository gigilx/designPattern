package com.lx.pattern.create.factory.simpleFactory;

/**
 * 工厂模式的作用是解耦，此处还是违反了开闭原则
 * 使用静态工厂模式更好，只需要在将创建对象的方法修改成静态的
 */
public class SimpleFactory {
    public Coffee createCoffee(String type) {
        if("american".equals(type)) {
            return new AmericanCoffee();
        } else if("latte".equals(type)) {
            return new LatteCoffee();
        } else {
            return null;
        }
    }
}
