package com.assignment.Task7;

import java.util.Scanner;

public class Program4_WordsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String string1= sc.nextLine();
        if(string1==null || string1.isEmpty()){
            System.out.println(0);
        }
        else{
            String[] words = string1.split("\\s+");
            System.out.println(words.length);
        }
    }
}
