package com.company;

import java.time.LocalDate;

public class Student {
    String name;
    String sex;
    String surname;
    LocalDate dateOfBirth;
    int age;


    public Student(String name, String sex, String surname, LocalDate dateOfBirth) {
        this.name = name;
        this.sex = sex;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.age = LocalDate.now().getYear()-this.dateOfBirth.getYear();
    }

    @Override
    public String toString (){
        String info = "Student:\nName: "+getName()+"\nSurname : "+getSurname()+"\nAge: "+getAge()+"\nDate of birth: "+getDateOfBirth()+"\nSex:"+getSex();
        return info;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
