package com.assignment.Task5;

public class Program2_SpaceStringReverse {
    public static void main(String[] args) {
        String str ="Consultadd Pvt";
        char a='!';
        int num=0;
        String nwstr="";
        String nxstr="";
        String rnwstr="";
        String rnxstr="";
        for(int i=0; i<=str.length()-1;i++){
            a=str.charAt(i);
            if(a==' '){
                num=i;
                break;
            }
            nwstr=nwstr+a;
            }
        System.out.println(num);
        for(int j=num+1; j<=str.length()-1; j++){
            a=str.charAt(j);
            nxstr=nxstr+a;
        }
        for(int i=nwstr.length()-1;i>=0;i--)
        {
            a=nwstr.charAt(i);
            rnwstr=rnwstr+a;
        }
        System.out.println(nwstr);
        System.out.println(nxstr);
        for(int j=nxstr.length()-1;j>=0;j--)
        {
            a=nxstr.charAt(j);
            rnxstr=rnxstr+a;
        }
        System.out.println(rnwstr+" "+rnxstr);

    }
}
