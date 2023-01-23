package com.assignment.task2;

import java.util.Scanner;

public class Program10_GrossSalary {
    public static void main(String[] args) {
        float HRA=0,DA=0,Gross_Salary;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the employee\'s Basic Salary: ");
        float Basic_Salary= sc.nextFloat();
        if (Basic_Salary<=15000){
            HRA=((25*Basic_Salary)/100);
            DA=((82*Basic_Salary)/100);
        }
        else if (Basic_Salary<=20200) {
            HRA=((27*Basic_Salary)/100);
            DA=((90*Basic_Salary)/100);
        }
        else if (Basic_Salary>20200) {
            HRA=((36*Basic_Salary)/100);
            DA=((95*Basic_Salary)/100);
        }
        Gross_Salary=(Basic_Salary+HRA+DA);
        System.out.println("Gross salary of an employee is "+Gross_Salary);
    }
}
