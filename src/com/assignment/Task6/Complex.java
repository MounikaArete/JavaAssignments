package com.assignment.Task6;

import java.util.Scanner;

public class Complex {

    public static void complexAddition(int first_real, int first_imaginary, int second_real, int second_imaginary){
        int tempReal = first_real+second_real;
        int tempComplex = first_imaginary+second_imaginary;
        System.out.println("Sum of two complex numbers is: "+tempReal+"+"+tempComplex+"i");
    }
    public static void complexSubtraction(int first_real, int first_imaginary, int second_real, int second_imaginary){
        int tempReal = first_real-second_real;
        int tempComplex = first_imaginary-second_imaginary;
        System.out.println("Difference between two complex numbers is: "+tempReal+"+"+tempComplex+"i");
    }
    public static void complexMultiplication(int first_real, int first_imaginary, int second_real, int second_imaginary){
        int temp1 = (first_real*second_real)-(first_imaginary*second_imaginary);
        int temp2 = (first_real*second_imaginary)+(first_imaginary*second_real);
        System.out.println("Product of two complex numbers is: "+temp1+"+"+temp2+"i");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first real number: ");
        int first_real = sc.nextInt();
        System.out.print("Enter the first imaginary number: ");
        int first_imaginary = sc.nextInt();
        System.out.print("Enter the second real number: ");
        int second_real = sc.nextInt();
        System.out.print("Enter the second imaginary number: ");
        int second_imaginary = sc.nextInt();
        complexAddition(first_real,first_imaginary,second_real,second_imaginary);
        complexSubtraction(first_real,first_imaginary,second_real,second_imaginary);
        complexMultiplication(first_real,first_imaginary,second_real,second_imaginary);

    }
}
