package com.assignment.Task6;

public class Employee {
    String name;
    Integer yearOfJoining;
    Double salary;
    String address;

    public Employee(String name,int yearOfJoining,double salary,String address){
        this.name = name;
        this.yearOfJoining=yearOfJoining;
        this.salary=salary;
        this.address=address;
    }

    public static void main(String[] args) {
        Employee e = new Employee("Robert",1994,20000,"64C- Walls Street");
       Employee e2= new Employee("Sam",2000,15000,"68D- Walls Street");
        Employee e3=new Employee("John",1999,17000,"26B- Walls Street");
        String name = e.name;
        int yearOfJoining = e.yearOfJoining;
        double salary = e.salary;
        String address =e.address;
        System.out.println("Name"+"    "+"YearOfJoining"+"  "+"Salary"+"    "+"Address");
        System.out.println(e.name+"    "+e.yearOfJoining+"        "+e.salary+"    "+e.address);
        System.out.println(e2.name+"       "+e2.yearOfJoining+"        "+e2.salary+"    "+e2.address);
        System.out.println(e3.name+"      "+e3.yearOfJoining+"        "+e3.salary+"    "+e3.address);
    }
}
