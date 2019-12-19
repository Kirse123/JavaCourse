package com.Kirill.task4;

import java.util.ArrayList;

public class Group {
    public int number;
    public ArrayList<String> students;

    Group(int number, ArrayList<String> students){
        this.number = number;
        //this.students = new ArrayList<String>();
        this.students = students;
    }
    Group(int number){
        this.number = number;
        this.students = new ArrayList<String>();
    }

    public void AddStudent(String studentFullName){
        this.students.add(studentFullName);
    }
}


