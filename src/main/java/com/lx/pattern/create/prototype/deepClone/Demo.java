package com.lx.pattern.create.prototype.deepClone;

public class Demo {
    public static void main(String[] args) {
        Citation citation = new Citation();
        Student stu = new Student("李四");
        citation.setStu(stu);
        try {
            Citation citation1 = citation.clone();
            Student stu1 = stu.clone();
            citation.setStu(stu1);
            System.out.println(citation1.getStu() == citation.getStu());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
