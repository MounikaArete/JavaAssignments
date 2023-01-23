package com.assignment.task1;

import java.util.Scanner;

public class Program2_UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name =sc.nextLine();
        System.out.println("We Welcome you "+name);
    }
}
