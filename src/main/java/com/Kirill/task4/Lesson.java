package com.Kirill.task4;

public class Lesson {
    public Subject subject;
    public DaysOfWeek day;
    public int timeOfLessom;
    public int room;
    public byte course;
    public int group;

    Lesson(DaysOfWeek day, int timeOfLesson, Subject subject, int room, byte course){
        this.day = day;
        this.timeOfLessom = timeOfLesson;
        this.subject = subject;
        this.room = room;
        this.course = course;
    }

    Lesson(DaysOfWeek day, int timeOfLesson, Subject subject, int room, int group){
        this.day = day;
        this.timeOfLessom = timeOfLesson;
        this.subject = subject;
        this.room = room;
        this.group = group;
    }
}
