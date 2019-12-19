package com.Kirill.task4;

public enum DaysOfWeek{
    mon("Monday"),
    tue("Tuesday"),
    wed("Wednesday"),
    thu("Thursday"),
    fri("Friday"),
    sat("Saturday"),
    sun("Sunday");

    private String day;

    DaysOfWeek(String day){
        this.day = day;
    }

    public String getDay(){
        return day;
    }
}
