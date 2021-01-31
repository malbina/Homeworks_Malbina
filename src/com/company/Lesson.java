package com.company;

import java.time.LocalDate;
import java.time.LocalTime;

public class Lesson {
    LocalDate dateOflesson;
    Student presentStudent [];
    Kurs kurs;
    LocalTime timeOfStart;
    boolean isHWdone;
    boolean isExamdone;

    public Lesson(LocalDate dateOflesson, Student students [], Kurs kurs, LocalTime timeOfStart, boolean isHWdone, boolean isExamdone) {
        this.dateOflesson = dateOflesson;
        this.presentStudent = students;
        this.kurs = kurs;
        this.timeOfStart = timeOfStart;
        this.isHWdone = isHWdone;
        this.isExamdone = isExamdone;
    }

    public Student[] getPresentStudent() {
        return presentStudent;
    }

    @Override
    public String toString () {
        String info = "\nDate of lesson: "+getDateOflesson()+"\nNumber of present students: "+getPresentStudent().length+"\nKurs: "+getKurs().getID()+"\nStarting time: "+getTimeOfStart()+
                "\nHas the teacher given a homework? :"+getisHWdone()+"\nHave the students today an exam: "+getisExamdone();
        return info;
    }
    
    public LocalDate getDateOflesson() {
        return dateOflesson;
    }

    public void setDateOflesson(LocalDate dateOflesson) {
        this.dateOflesson = dateOflesson;
    }

    public Kurs getKurs() {
        return kurs;
    }

    public void setKurs(Kurs kurs) {
        this.kurs = kurs;
    }

    public LocalTime getTimeOfStart() {
        return timeOfStart;
    }

    public void setTimeOfStart(LocalTime timeOfStart) {
        this.timeOfStart = timeOfStart;
    }

    public boolean getisHWdone() {
        return isHWdone;
    }

    public void setHWdone(boolean HWdone) {
        isHWdone = HWdone;
    }

    public boolean getisExamdone() {
        return isExamdone;
    }

    public void setExamdone(boolean examdone) {
        isExamdone = examdone;
    }
}
