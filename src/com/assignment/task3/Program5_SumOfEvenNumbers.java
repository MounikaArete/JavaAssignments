package com.assignment.task3;

import java.util.Scanner;

public class Program5_SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("To find the sum of first n even numbers, enter the n value: ");
        int n= sc.nextInt();
        int sum=0;
        int count=1;
            while(count<=(2*n)){
                if(count%2==0){
                    sum=sum+count;
                }
                count++;
        }
        System.out.println("Sum of first "+ n + " Even numbers is: "+sum);
    }
}

