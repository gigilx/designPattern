package com.lx.princples.LawOfDemeter;

public class Agent {
    private String name;
    private Fans fans;
    private Company company;
    private Star star;

    public Agent(String name) {
        this.name = name;
    }

    public Agent(String name , Fans fans, Company company , Star star) {
        this.name = name;
        this.fans = fans;
        this.star = star;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFans(Fans fans) {
        this.fans = fans;
    }
    public void setCompany(Company company) {
        this.company = company;
    }

    public void setStar(Star star) {
        this.star = star;
    }

    public Fans getFans() {
        return fans;
    }

    public Company getCompany() {
        return company;
    }


    public Star getStar() {
        return star;
    }

    public void meeting() {
        System.out.println("大明星" + star.getName() + "和粉丝" + fans.getName() + "见面");
    }


    public void business() {
        System.out.println("经纪人" + getName() + "和代理商" + name + "洽淡合同");
    }
}
