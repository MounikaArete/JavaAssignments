package com.assignment.task3;

import java.util.Scanner;

public class Program3_Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word=sc.nextLine();
        String nwstr="";
        char[] result=word.toCharArray();
        //System.out.println(result);
        for(int i=result.length-1;i>=0;i--){
            nwstr+=result[i];
        }
        System.out.println(nwstr);
        System.out.println(word);
        if (word.equals(nwstr)){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    }
}
