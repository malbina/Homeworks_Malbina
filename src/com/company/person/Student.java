package com.company.person;

import com.company.person.Person;

import java.time.LocalDate;

public class Student extends Person {
    private int age= LocalDate.now().getYear()-getDateOfBirth().getYear();
   private String faculty;

    public Student (){}
    public Student (String name, String surname, String sex, LocalDate dateOfBirth,String faculty){
       super(name,surname,sex,dateOfBirth);
       this.faculty=faculty;
    }

    @Override
    public String toString(){
        String info ="Student:\nName: " + getName() + "\nSurname : " + getSurname() + "\nAge: " + getAge() + "\nFaculty: "+getFaculty()+"\nDate of birth: " + getDateOfBirth() + "\nSex:" + getSex();
    return info;}

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}
