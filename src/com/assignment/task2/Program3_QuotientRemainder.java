package com.assignment.task2;

import java.util.Scanner;

public class Program3_QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first_number = sc.nextInt();
        System.out.print("Enter second number: ");
        int second_number = sc.nextInt();
        double d_first_number = first_number;
        double d_second_number = second_number;
        double quotient;
        int remainder;
        quotient = d_first_number / d_second_number;
        remainder = first_number % second_number;
        System.out.println("Quotient of two numbers is: " + quotient);
        System.out.println("Remainder of two numbers is: " + remainder);
    }

}