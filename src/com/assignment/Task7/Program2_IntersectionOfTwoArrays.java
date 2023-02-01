package com.assignment.Task7;

public class Program2_IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int Array1[] = {22,33,44,55,66,77,88};
        int Array2[] = {72,73,74,75,76,77,78,79,80};
        for(int i = 0; i<Array1.length; i++ ) {
            for(int j = 0; j<Array2.length; j++) {
                if(Array1[i]==Array2[j]) {
                    System.out.println("Intersection of two arrays is: "+Array1[i]);
                }
            }
        }
    }
}
