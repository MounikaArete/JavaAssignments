package com.assignment.Task5;

import java.util.Scanner;

public class Program4_CountChar {
    public static void main(String[] args) {
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String string1=sc.nextLine();
        System.out.print("Enter the character: ");
        char ch =sc.next().charAt(0);
        for(int i=0;i<=string1.length()-1;i++){
            if(string1.charAt(i)==ch){
                count++;
            }
        }
        System.out.println("Number of times \'"+ch+"\' has occured: "+count);
    }
}
