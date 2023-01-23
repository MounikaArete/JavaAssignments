package com.assignment.task2;

import java.util.Scanner;

public class Program5_Grade {
    public static void main(String[] args) {
        String grade="";
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the percentage: ");
        int percentage= sc.nextInt();
        if (percentage>90){
            System.out.println("You got grade \'A'");
        }
        else if (percentage>75) {
            System.out.println("You got grade \'B'");
        }
        else if (percentage>65){
            System.out.println("You got grade \'C'");
        }
    }
    }

