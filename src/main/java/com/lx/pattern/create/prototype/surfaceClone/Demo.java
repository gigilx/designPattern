package com.lx.pattern.create.prototype.surfaceClone;

public class Demo {
    public static void main(String[] args) {
        Citation citation = new Citation();
        citation.setName("张三");
        try {
            Citation citation1 = citation.clone();
            citation1.setName("李四");
            System.out.println(citation);
            System.out.println(citation1);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
