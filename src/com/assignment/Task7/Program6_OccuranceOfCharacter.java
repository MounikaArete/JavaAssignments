package com.assignment.Task7;

import java.util.*;

public class Program6_OccuranceOfCharacter {
    public static void main(String[] args) {
        int count=0, flag=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String string1=sc.nextLine();
        String lString1=string1.toLowerCase();
        printOccurencesOfCharacters(lString1);
    }

    public static void printOccurencesOfCharacters(String string) {
        int length = string.length();
        HashMap<Character, Integer> occurences = new HashMap<>();
        for(int i=0; i<length; i++){
            if(occurences.get(string.charAt(i)) == null){
                occurences.put(string.charAt(i), 1);
            } else{
                int alreadyExistingValue = occurences.get(string.charAt(i));
                occurences.put(string.charAt(i), ++alreadyExistingValue);
            }
        }

        Set<Character> keySet = occurences.keySet();
        for (Character character : keySet){
            System.out.println(character + "= " + occurences.get(character));
        }
    }
}
