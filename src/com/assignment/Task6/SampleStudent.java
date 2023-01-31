package com.assignment.Task6;

public class SampleStudent {
    String studentName;

    public SampleStudent(String studentName){
        this.studentName = studentName;
    }
    public SampleStudent(){
        this.studentName = "Unknown";
    }
    public static void main(String[] args) {
        SampleStudent studentName = new SampleStudent("Mounika");
        SampleStudent studentName1 = new SampleStudent();
        System.out.println("Name with parameters: "+studentName.studentName);
        System.out.println("Name with out parameters: "+studentName1.studentName);
    }
}
