package com.assignment.task4.program1;

import java.util.Scanner;

public class Program2_AverageUsingArrays {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the count of numbers: ");
        int count=sc.nextInt();
        int[] numbers= new int[count];
        System.out.println("Enter the numbers:");
        for(int i=0;i<count;i++){
            numbers[i]=sc.nextInt();
            sum=sum+numbers[i];
        }
        float f_count=count;
        float f_sum=sum;
        float average=((f_sum/f_count));
        System.out.println("Average of given "+count+" numbers is: " +average);

    }

}
