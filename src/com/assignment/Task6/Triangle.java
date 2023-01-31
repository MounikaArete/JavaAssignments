package com.assignment.Task6;

public class Triangle {
    int side1, side2, side3;
    public Triangle() {
        side1 = 3;
        side2 = 4;
        side3 = 5;
    }
    public static void main(String[] args) {
        Triangle T = new Triangle();
        int perimeter = T.side1+ T.side2+ T.side3;
        Float fside1 = (float) T.side1;
        Float fside2 = (float) T.side2;
        Float fside3 = (float) T.side3;
        Float semiPerimeter = (float) perimeter/2;
        float mulSides = semiPerimeter * (semiPerimeter-fside1) * (semiPerimeter-fside2) * (semiPerimeter-fside3);
        float area = (float) Math.sqrt(mulSides);
        System.out.println("Perimeter of the traingle: "+perimeter);
        System.out.println("Area of the triangle is: "+area);
    }


}
