package com.assignment.task2;

import com.sun.source.tree.ContinueTree;

import java.util.Scanner;

public class Program7_BCPN {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Integer value: ");
            int value = sc.nextInt();
            while (value!=0){
                if (value>0){
                    System.out.println("Good Going");
                } else if (value<0) {
                    System.out.println("It's Over");
                   break;
                }
                System.out.print("Enter the Integer value: ");
                int value1 = sc.nextInt();
                value=value1;
                continue;
            }
            if (value==0){
                System.out.println("It is neither positive nor negative number");
            }

        }
    }

