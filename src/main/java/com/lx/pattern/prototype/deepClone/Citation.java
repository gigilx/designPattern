package com.lx.pattern.prototype.deepClone;

public class Citation implements Cloneable{

    private Student stu;

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

    public Citation(){
        System.out.println("citation对象创建了。。。");
    }
    @Override
    public Citation clone() throws CloneNotSupportedException {
        System.out.println("复制了一个citation对象");
        return (Citation) super.clone();
    }

    @Override
    public String toString() {
        return "Citation{" +
                "name='" + stu.getName() + '\'' +
                '}';
    }
}
