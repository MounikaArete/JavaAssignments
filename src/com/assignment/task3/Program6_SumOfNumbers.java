package com.assignment.task3;

import java.util.Scanner;

public class Program6_SumOfNumbers {
    public static void main(String[] args) {
        int sum=0;
        boolean addition;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            int first_number= sc.nextInt();
            System.out.print("Enter the second number: ");
            int second_number= sc.nextInt();
            sum=first_number+second_number;
            System.out.println("Sum of two numbers is: "+sum);
            System.out.print("Do you wish to perform the additon again? If yes type \"Yes\" or type \"No\": ");
            String choice= sc.next();
            if (choice.equals("No")) {
                System.out.println("Try next time. Bye!!");
                break;
            }
            else if (choice.equals("Yes")) {
                addition=true;
            }
            else{
                System.out.println("Try next time. Bye!!");
                break;
            }
        }
        while(addition=true);
    }
}
