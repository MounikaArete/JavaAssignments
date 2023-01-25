package com.assignment.task4;

import java.util.Scanner;

public class Program6_FindIntegersOfSum {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size=sc.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter the numbers:");
        for(int i=0;i<size;i++){
            numbers[i]= sc.nextInt();
        }
        System.out.print("Enter the target value: ");
        int TargetValue=sc.nextInt();
        for(int i=0;i<size;i++){
            int FirstNumber=numbers[i];
            for(int j=(size-1);j>0;j--){
                int SecondNumber=numbers[j];
                sum = FirstNumber + SecondNumber;
                if(sum==TargetValue){
                    System.out.println("Sum of "+ FirstNumber +"+"+SecondNumber+"is: "+ TargetValue);
                }
            }
        }
    }
}
