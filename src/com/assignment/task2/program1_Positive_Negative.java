package com.assignment.task2;

import java.util.Scanner;

public class program1_Positive_Negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Integer value: ");
        int value =sc.nextInt();
        System.out.println();
        if (value >0){
            System.out.println("It is a positive number");
        } else if (value<0) {
            System.out.println("It is a negative number");
        }
        else{
            System.out.println("It is neither positive nor negative");
        }
    }
}
