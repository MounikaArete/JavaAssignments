package com.assignment.task4;

import java.util.Arrays;
import java.util.Scanner;

public class Program8_ThirdLargestInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size=sc.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter the numbers:");
        for(int i=0;i<size;i++){
            numbers[i]= sc.nextInt();
        }
        Arrays.sort(numbers);
        if(size>=3) {
            System.out.println("Third Largest element is: " + numbers[size - 3]);
        }
        else{
            System.out.println("Not enough numbers");
        }
    }
}
