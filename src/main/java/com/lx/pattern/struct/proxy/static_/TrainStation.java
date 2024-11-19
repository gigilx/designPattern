package com.lx.pattern.struct.proxy.static_;

/**
 * 具体实现类
 */
public class TrainStation implements SellTickets{

    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
