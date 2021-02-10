package com.company.kurs;

import java.time.LocalDate;

public class Kurs {
   private String name;
   private LocalDate dateOfCreate;
   private String ID;
   private String teacher;

    public Kurs (){}
    public Kurs(String name, LocalDate dateOfCreate, String ID, String teacher) {
        this.name = name;
        this.ID = ID;
        this.teacher = teacher;
        this.dateOfCreate = dateOfCreate;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfCreate() {
        return dateOfCreate;
    }

    public void setDateOfCreate(LocalDate dateOfCreate) {
        this.dateOfCreate = dateOfCreate;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        String info = "Kurs:\nName: "+getName() +"\nID: "+getID()+"\nName of teacher: "+getTeacher()+"\nDate of Create: "+getDateOfCreate();
        return info;
    }
}
