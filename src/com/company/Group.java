package com.company;

import java.time.LocalDate;

public class Group {
    Student students [];
    Kurs kurs;
    LocalDate dateOfStart;
    int duration;


    public Group(int numOfStudents, Kurs kurs, LocalDate dateOfStart, int duration) {
        this.students = new Student[numOfStudents];
        this.kurs = kurs;
        this.dateOfStart = dateOfStart;
        this.duration = duration;
    }

    public LocalDate getDateOfStart() {
        return dateOfStart;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setDateOfStart(LocalDate dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public Kurs getKurs() {
        return kurs;
    }

    public void setKurs(Kurs kurs) {
        this.kurs = kurs;
    }

    public Student[] getStudents() {
        return students;
    }

    @Override
    public String toString (){
        String info = "Group: \nKurs: "+getKurs().getID()+"\nDate of start: "+getDateOfStart()+"\nDuration: "+getDuration()+" month"+"\nNumber of students: "+getStudents().length;
                return  info;

    }
}
