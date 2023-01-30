package com.assignment.Task5;

import java.util.Scanner;

public class Program6_Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String First_String=sc.nextLine();
        System.out.print("Enter the substring : ");
        String SubString= sc.nextLine();
        if(First_String.contains(SubString)){
            System.out.println("It exists");
        }
        else{
            System.out.println("It does not exist");
        }
    }
}
