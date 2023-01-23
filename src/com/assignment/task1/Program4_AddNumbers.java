package com.assignment.task1;

import java.util.Scanner;

public class Program4_AddNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int first_number=sc.nextInt();
        System.out.print("Enter Second Number: ");
        int second_number= sc.nextInt();
        int sum_of_two_numbers=first_number+second_number;
        System.out.println("Sum of two numbers: "+sum_of_two_numbers);
    }
}
