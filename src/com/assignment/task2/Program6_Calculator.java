package com.assignment.task2;

import java.util.Scanner;

public class Program6_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the mathematical operation like \'+,-,*,/' to perform operation: ");
        char symbol=sc.next().charAt(0);
        System.out.print("Enter first number: ");
        int first_number=sc.nextInt();
        System.out.print("Enter second number: ");
        int second_number= sc.nextInt();
        double d_first_number = first_number;
        double d_second_number = second_number;
        int output;
        double d_output = 0;
        switch (symbol){
            case '+' :
                output=first_number+second_number;
                System.out.println("Sum of two numbers is: "+output);
                break;
            case '-':
                output=first_number-second_number;
                System.out.println("Difference of two numbers is: "+output);
                break;
            case '*':
                output=first_number*second_number;
                System.out.println("Multiplication of two numbers is: "+output);
                break;
            case '/':
                d_output=d_first_number/d_second_number;
                System.out.println("Division of two numbers is: "+d_output);
                break;
            default:
                System.out.println("You have entered wrong operator");
                return;

        }

    }
}
