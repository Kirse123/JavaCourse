package com.Kirill.task4;


import java.lang.reflect.Array;
import java.util.ArrayList;

public class Schedule {
    private ArrayList<Lesson> lessons;

    Schedule(){
        this.lessons = new ArrayList<Lesson>();
    }

    public void AddLesson(Lesson lesson){
        this.lessons.add(lesson);
    }

    //Get... methods
    public ArrayList<Lesson> GetLessonsOnDay(DaysOfWeek day){
        ArrayList<Lesson> resList = new ArrayList<Lesson>();
        for (int i = 0; i < this.lessons.size(); i++){
            Lesson tmp = this.lessons.get(i);
            if (tmp.day == day){
                resList.add(lessons.get(i));
            }
        }
        return resList;
    }
    public ArrayList<Lesson> GetLessonsForGroup(int group){
        ArrayList<Lesson> resList = new ArrayList<Lesson>();
        for (int i = 0; i < this.lessons.size(); i++){
            Lesson tmp = this.lessons.get(i);
            if (tmp.group == group){
                resList.add(lessons.get(i));
            }
        }
        return resList;
    }
    public ArrayList<Lesson> GetLessonsForLector(String fullName){
        ArrayList<Lesson> resList = new ArrayList<Lesson>();
        for (int i = 0; i < this.lessons.size(); i++){
            Lesson tmp = this.lessons.get(i);
            if (tmp.subject.lectorName == fullName){
                resList.add(lessons.get(i));
            }
        }
        return resList;
    }
}


