package com.lx.princples.LiReplacement.before;

public class RectangleDemo {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(20);
        rectangle.setWidth(10);
        resize(rectangle);
        Square square = new Square();
        square.setLength(10);
        //违反李氏替换原则
        resize(square);
    }

    public static void resize(Rectangle rectangle){
        while(rectangle.getWidth() > rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth()+1);
        }
    }

    public static void printLengthAndWidth(Rectangle rectangle) {
        System.out.println(rectangle.getLength() +  " " + rectangle.getWidth());
    }

}
