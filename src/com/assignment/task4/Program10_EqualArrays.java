package com.assignment.task4;

import java.util.Scanner;

public class Program10_EqualArrays {
    public static void main(String[] args) {
        int count=0;
        System.out.print("Please enter the rows in the matrix: ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        System.out.print("Please enter the columns in the matrix: ");
        int column = sc.nextInt();

        int[][] first = new int[row][column];
        int[][] second = new int[row][column];
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                System.out.println(String.format("Enter first[%d][%d] integer", r, c));
                first[r][c] = sc.nextInt();
            }
        }

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                System.out.println(String.format("Enter second[%d][%d] integer", r, c));
                second[r][c] = sc.nextInt();
            }
        }
        System.out.println("First Matrix");
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                System.out.print(first[r][c]+"");
            }
            System.out.println();
            }
        System.out.println("Second Matrix");
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                System.out.print(second[r][c]);
            }
            System.out.println();
        }
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                if(first[r][c]==second[r][c]){
                    count++;
                }
            }
        }
        if (count == (row * column)) {
            System.out.println("Both Matrices are equal.");
        }
        else{
            System.out.println("Both Matrices are not equal.");
        }
    }
}

