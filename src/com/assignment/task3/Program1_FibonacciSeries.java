package com.assignment.task3;

import java.util.Scanner;

public class Program1_FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first_number=0,second_number=1,sum=0;
        System.out.print("Enter the count: ");
        int count= sc.nextInt();
        System.out.println("Fibonocci Series of " + count +" numbers is: ");
        for(int i=2;i<count+2;i++){
            sum=first_number+second_number;
            first_number=second_number;
            second_number=sum;
            System.out.print(" "+sum);
        }
    }
}
