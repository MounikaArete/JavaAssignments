package com.assignment.task4;

import java.util.Scanner;

public class Program3_LinearSearch {

    public static void main(String[] args) {
        int a[]={1,2,3,4};
        Scanner sc = new Scanner(System.in);
        System.out.print("Search a number: ");
        int key = sc.nextInt();
        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                System.out.println("Found the number.");
                break;
            }
            if(i==a.length-1){
                System.out.println("Not found");
            }
        }
    }
}
