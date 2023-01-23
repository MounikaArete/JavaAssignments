package com.assignment.task1;

public class Program3_SwapNumbers_1 {
    public static void main(String[] args) {
        int first_number = 2;
        int second_number = 7;
        System.out.println("First number before the swap: "+first_number);
        System.out.println("Second number before the swap: "+second_number);
        first_number=first_number+second_number;
        second_number=first_number-second_number;
        first_number=first_number-second_number;
        System.out.println("First number after the swap: "+first_number);
        System.out.println("Second number after the swap: "+second_number);

    }
}
