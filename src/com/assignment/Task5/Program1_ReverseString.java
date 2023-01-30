package com.assignment.Task5;

public class Program1_ReverseString {
    public static void main(String[] args) {
        String str ="Consultadd";
        char a=' ';
        String nwstr="";
        for (int i=str.length()-1;i>=0;i--){
            a=str.charAt(i);
            nwstr=nwstr+a;
        }
        System.out.println(nwstr);

    }
}
