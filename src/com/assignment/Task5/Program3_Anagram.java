package com.assignment.Task5;

import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.Arrays;

public class Program3_Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String string1=sc.nextLine();
        System.out.print("Enter the second string: ");
        String string2= sc.nextLine();
        if (string1.length()==string2.length()){
            char[] string1char=string1.toCharArray();
            char[] string2char=string2.toCharArray();
            Arrays.sort(string1char);
            Arrays.sort(string2char);
            if (Arrays.equals(string1char,string2char)){
                System.out.println("Both are anagrams to each other");
            }
            else {
                System.out.println("Both are not anagrams to each other");
            }
        }
        else {
            System.out.println("Both are not anagrams to each other");
        }

    }
}
