package com.company;
public class Rectangle extends Figures {
    public String name = "Rectangle";
    private double Rectangle;

    public Rectangle(String name) {
        super(name);
    }

    public void FiguresRectangle() {
        this.setName(name);
        System.out.print(this.getName());
    }

    public static double x, y, result;

    public static double sq1(double x, double y) {
        if(x<=0||y<=0) {
            System.out.print("ERROR. Check the values");
            return 0;
        }
        result = x * y;
        return result;
    }

    public static double sq2(double x, double y){
        if(x<=0||y<=0) {
            System.out.print("ERROR. Check the values");
            return 0;
        }
        result=x*y;
        return result;

    }
}
