package com.lx.princples.LawOfDemeter;

public class Demo {
    public static void main(String[] args) {
        Company company = new Company("腾讯");
        Star star = new Star("刘德华");
        Fans fans = new Fans("张三");
        Agent agent = new Agent("王小华" , fans , company, star);
        agent.business();
        agent.meeting();
    }
}
