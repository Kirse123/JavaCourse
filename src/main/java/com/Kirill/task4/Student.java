package com.Kirill.task4;

public class Student extends Person {

    protected byte course;
    protected int groupNumber;

    Student(int age, Gender gender, String fullName, byte cours, int groupNumber){
        super(age, gender, fullName);
        this.course = cours;
        this.groupNumber = groupNumber;
    }
}
