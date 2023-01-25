package com.assignment.task3;

public class Program10_Star2 {
    public static void main(String args[]) {
        int col = 10;
        printPattern(col);
    }

    private static void printPattern(int col) {
        char[] patternArray = new char[col];
        for(int i=0; i<col ;i++){
            patternArray[i]= ' ';
        }
        for(int i=0, j=col-1; i<=j; i++, j--){
            patternArray[i] = '*';
            patternArray[j] = '*';
            System.out.println(String.valueOf(patternArray));
        }
    }
}
