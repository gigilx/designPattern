package com.lx.pattern.struct.proxy.static_;

/**
 * 代理类
 */
public class ProxyPoint implements SellTickets{

    private TrainStation station = new TrainStation(); //组合关系“同生共死”

    @Override
    public void sell() {
        System.out.println("代理点收取服务费用");
        station.sell();
    }
}
