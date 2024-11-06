package com.lx.princples.LiReplacement.after;

public class RectangleDemo {

    //遵守了李氏替换原则
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(20);
        rectangle.setWidth(10);
        resize(rectangle);
    }

    public static void resize(Rectangle rectangle){
        while(rectangle.getWidth() > rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth()+1);
        }
    }

    public static void printLengthAndWidth(Quadrilateral quadrilateral) {
        System.out.println(quadrilateral.getLength() +  " " + quadrilateral.getWidth());
    }

}
