package com.Kirill.task4;

enum Gender{
    Male,
    Female
}

public class Person {

    protected int age;
    protected Gender gender;
    protected String firstName;
    protected String secondName;
    protected String lastName;
    protected String fullName;

    Person (int age, Gender gender, String firstName, String secondName, String lastName){
        this.age = age;
        this.gender = gender;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    Person (int age, Gender gender, String fullName){
        this.age = age;
        this.gender = gender;
        this.fullName = fullName;
    }

    Person(){}

    //public methods for accessing properties
    public int GetAge(){
        return age;
    }
    public Gender GetGender(){
        return gender;
    }
    public String GetFullName(){
        return firstName + " " + secondName + " " + lastName;
    }
    public String GetFirstName(){
        return firstName;
    }
    public String GetSecondName(){
        return secondName;
    }

    public String GetLastName(){
        return lastName;
    }
}
