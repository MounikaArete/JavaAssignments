package com.assignment.task4;

import java.util.Arrays;
import java.util.Scanner;

public class Program4_BinarySearch {
    public static void main(String[] args) {
        int a[] = {54,63,21,76,94,12,32,46};
        Scanner sc = new Scanner(System.in);
        System.out.print("Search a number: ");
        int key = sc.nextInt();
        int count=0;
        Arrays.sort(a);
        int start = 0, end = a.length-1, mid = (start + end)/2;
        while(start < end && start != mid){
            if(a[start]==key || a[end]==key){
                System.out.println("Found the key");
                count++;
                break;
            }
            else if(a[mid] == key) {
                System.out.println("Found the key");
                count++;
                break;
            }
            else if (key < a[mid]) {
                end = mid;
                mid = (start + end)/2;
            }
            else if(key > a[mid])  {
                start = mid;
                mid = (start+end)/2;
            }
          }
        if(count==0){
            System.out.println("Did not find the key");
        }

    }
}
