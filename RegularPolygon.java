package com.company;
import static java.lang.Math.sin;
import static java.lang.Math.toRadians;

public class RegularPolygon extends Figures {
    public RegularPolygon(String name) {
        super(name);
    }

    public String name = "RegularPolygon";
    private double RegularPolygon;

    public void FiguresRegularPolygon() {
        this.setName(name);
        System.out.print(this.getName());
    }

    public static double R, result;

    public static double rd(double a, double n) {
        if (n <= 0) {
            System.out.print("ERROR. Check the values");
            return 0;
        }
        result=((a)/(2*sin((toRadians(360)/(2*n)))));
        return result;
    }
    public static double perimeter(double a,double n){
        result=a*n;
        return result;
    }
}
