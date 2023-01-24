package com.assignment.task4.program1;

import java.util.Scanner;

public class Program1_ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of fruits you have in your store: ");
        int size=sc.nextInt();
        String[] fruits = new String[size];
        System.out.println("Enter the fruit names:");
        for(int i=0;i<size;i++){
            fruits[i]= sc.next();
        }
        System.out.println("Fruit names which you have in your store are:");
        for(int i=0; i<size;i++){
            System.out.println(fruits[i]);
        }
    }
}