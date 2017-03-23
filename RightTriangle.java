package com.company;

import static java.lang.StrictMath.sqrt;

public class RightTriangle extends Figures{
    public RightTriangle(String name) {
        super(name);
    }
    public String name = "RightTriangle";
    private double RightTriangle;
    public void FiguresRightTriangle(){
        this.setName(name);
        System.out.print(this.getName());
    }
    public static double h;
    public static double h(double a, double b){
        if (a<=0) {
            System.out.print("ERROR. Check the values");
            return 0;
        }
        h=sqrt(a*b);
        return h;
    }
}
