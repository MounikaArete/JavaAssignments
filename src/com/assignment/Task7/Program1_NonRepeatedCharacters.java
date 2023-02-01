package com.assignment.Task7;

import java.util.Scanner;

public class Program1_NonRepeatedCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = sc.nextLine();
        String string1=input.toLowerCase();
        int count = 0;
        char firstNRC=' ';
        for (char i : string1.toCharArray()) {
            if (string1.indexOf(i) == string1.lastIndexOf(i)) {
                firstNRC = i;
                break;
            }
            else {
                count ++;
            }
        }
        if (count == (string1.length())) {
                 System.out.println("Either all characters are repeating or "
                    + "string is empty");
        }
        else {
                System.out.println("First non-repeating character is " + firstNRC);
        }
    }
}
