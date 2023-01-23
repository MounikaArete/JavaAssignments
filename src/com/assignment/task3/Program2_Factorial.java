package com.assignment.task3;

import java.util.Scanner;

public class Program2_Factorial {
    public static void main(String[] args) {
        int factorial=1;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number to find the factorial: ");
        int fact_number=sc.nextInt();
        for(int i =1; i<=fact_number;i++){
            factorial=factorial*i;
        }
        System.out.println("Factorial of the "+ fact_number+ " is: " + factorial);
    }
}
