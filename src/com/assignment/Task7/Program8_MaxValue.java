package com.assignment.Task7;

public class Program8_MaxValue {
    static int[] array ={10,20,30,40,50,90};
    static int max(){
        int max = array[0];
        for (int i = 1; i < array.length; i++)
            if (array[i] > max)
                max = array[i];

        return max;
    }
    public static void main(String[] args) {
        System.out.println("Maximum value in the given array is " + max());
    }
}
