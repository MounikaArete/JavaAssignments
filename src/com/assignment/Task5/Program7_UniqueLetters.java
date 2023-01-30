package com.assignment.Task5;
import java.util.*;
public class Program7_UniqueLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String string1 = sc.nextLine();
        System.out.println("Value is: " + findIfRepeatingChar(string1));
    }
    private static boolean findIfRepeatingChar(String string1) {
        int count = 0;
        int length=string1.length();
        for (int i = 0; i < length; i++) {
            for (int j = length-1; j >= 0; j--) {
                if(string1.charAt(i)==string1.charAt(j)){
                    count++;
                }
            }
        }
        if(count>(length)) {
            System.out.println("\'Non Unique\' Characters are present in the word "+string1);
            return false;
        }
        System.out.println("\'Unique Characters\' are present in the word "+string1);
        return true;

    }
}
