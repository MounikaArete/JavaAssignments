package com.assignment.Task7;

import java.util.Scanner;

public class Program7_PermutationOfString {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        int len = str.length();
        System.out.println("All the permutations of the string are: ");
        Permutation(str, 0, len);
    }


    public static void Permutation (String str, int start, int end)
    {
        if (start == end-1)
            System.out.println(str);
        else
        {
            for (int i = start; i < end; i++)
            {
                str = swapString(str,start,i);
                Permutation(str,start+1,end);
                str = swapString(str,start,i);
            }
        }
    }
    public static String swapString(String first, int i, int j) {
        char[] second =first.toCharArray();
        char character;
        character = second[i];
        second[i] = second[j];
        second[j] = character;
        return String.valueOf(second);
    }

}
