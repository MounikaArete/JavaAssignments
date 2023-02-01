package com.assignment.Task7;

import java.util.Scanner;

public class Program5_AmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        int final_number=number,remainder,result=0;
        while (final_number!=0){
            remainder = final_number % 10;
            result += Math.pow(remainder, 3);
            final_number = final_number / 10;
        }
        if(result==number)
            System.out.println("It is a Amstrong Number");
        else
            System.out.println("It is not a Amstrong Number");

    }
}
