package com.assignment.Task5;

import java.util.Locale;
import java.util.Scanner;

public class Program5_CountVowelsConsonants {
    public static void main(String[] args) {
        int count = 0;
        int occurance=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String string1 = sc.nextLine();
        String Lstring1=string1.toLowerCase();
        System.out.println(Lstring1);
        for(int i=0;i<=Lstring1.length()-1;i++){
            if (Lstring1.charAt(i) == 'a'||Lstring1.charAt(i) == 'e'||Lstring1.charAt(i) == 'i'||Lstring1.charAt(i) == 'o'||Lstring1.charAt(i) == 'u') {
                count++;
            }
            else if (Lstring1.charAt(i)>='a'&& Lstring1.charAt(i)<='z') {
                occurance++;
            }
        }
        System.out.println("Number of vowels in "+string1+" is: "+count);
        System.out.println("Number of consonants in "+string1+" is: "+occurance);
    }

}
