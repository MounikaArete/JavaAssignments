package com.assignment.Task6;

public class Rectangle {
    private int length;
    private int breadth;
    public Rectangle(){
        this.breadth = 0;
        this.length = 0;
    }
    public Rectangle(int length){
        this.length = length;
        this.breadth = this.length;
    }
    public Rectangle(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public int area(){
        return this.length * this.breadth;
    }
    public static void main(String[] args) {
        Rectangle noneParameters = new Rectangle();
        Rectangle oneParameter = new Rectangle(4);
        Rectangle twoParameters = new Rectangle(3,4);

        System.out.println("Area of Rectangle: "+noneParameters.area());
        System.out.println("Area of Rectangle: "+oneParameter.area());
        System.out.println("Area of Rectangle: "+twoParameters.area());
    }
}
