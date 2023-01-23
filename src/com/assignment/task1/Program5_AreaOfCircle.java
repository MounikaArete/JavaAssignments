package com.assignment.task1;

import java.util.Scanner;

public class Program5_AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of radius: ");
        double radius =sc.nextDouble();
        double Area = (3.14*radius*radius);
        System.out.println("Area of circle is: "+ Area);
    }
}
