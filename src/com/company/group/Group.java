package com.company.group;

import com.company.kurs.Kurs;
import com.company.person.Student;

import java.time.LocalDate;

public class Group {
    private Student students [];
    private Kurs kurs;
    private LocalDate dateOfStart;
    private int duration;


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
