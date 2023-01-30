package com.assignment.Task5;

import java.util.Scanner;

public class Program8_BalancedBraces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string with brackets: ");
        String string1 = sc.nextLine();
        System.out.println("Value is: " + findIfBalancedBraces(string1));
    }
    private static boolean findIfBalancedBraces(String string1) {
        int count=0,flag=0,occurance=0;
        int length = (string1.length());
        while(length%2==0){
            for(int i=0;i<length;i++){
                if (string1.charAt(i) =='{')
                    count++;
                else if (string1.charAt(i) =='}')
                    count--;
                if (string1.charAt(i) =='[')
                    flag++;
                else if (string1.charAt(i) ==']')
                    flag--;
                if (string1.charAt(i) =='(')
                    occurance++;
                else if (string1.charAt(i) ==')')
                    occurance--;
            }
            if(count==0 && flag ==0 && occurance==0){
                System.out.println("valid parenthesis");
                return true;
            }
            else {
                System.out.println("Invalid parenthesis");
                return false;
            }
        }
        System.out.println("Invalid parenthesis");
        return false;

    }
}
