package com.company;
public class Circle extends Figures{
    public Circle(String name) {
        super(name);
    }
    public String name = "Circle";
    private double Circle;
    public void FiguresCircle(){
        this.setName(name);
        System.out.print(this.getName());
    }

    public static double Pi=3.14, R, x, y, result;
    public static double sq1(double x, double y, double R){
        if (R<=0) {
            System.out.print("ERROR. Check the values");
            return 0;
        }
result=Pi*R*R;
return result;
    }
    public static double sq2(double x, double y, double R){
        if (R<=0) {
            System.out.print("ERROR. Check the values");
            return 0;
        }
       result=Pi*R*R;
        return result;
    }

}
