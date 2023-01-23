package com.assignment.task2;

import java.util.Scanner;

public class Program2_Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character: ");
        char alphabet= sc.next().charAt(0);
        if ((alphabet>='a'&& alphabet<='z')||(alphabet>='A'&& alphabet<='Z')){
            System.out.println("It is an alphabet");
        }
        else{
            System.out.println("It is not an alphabet");
        }

    }
}
