package com.company;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("Rectangle");
        System.out.println(rectangle.getName() + ":" + Rectangle.sq1(3, 8));
        System.out.println(rectangle.getName() + ":" + Rectangle.sq2(6, 4));
        Circle circle = new Circle("Circle");
        System.out.println(circle.getName() + ":" + Circle.sq1(0, 0, 12));
        System.out.println(circle.getName() + ":" + Circle.sq2(3, 5, 11));
        RegularPolygon regularPolygon = new RegularPolygon("RegularPolygon");
        System.out.println(regularPolygon.getName()+":"+RegularPolygon.rd(6,7));
        System.out.println("Perimeter:"+RegularPolygon.perimeter(6,7));
        RightTriangle rightTriangle = new RightTriangle("RightTriangle");
        System.out.print(rightTriangle.getName()+":"+RightTriangle.h(3,4));
    }
}
