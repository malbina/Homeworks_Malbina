package com.company.person;

import java.time.LocalDate;

public class Person {
    private String name;
    private  String surname;
    private String sex;
    private LocalDate dateOfBirth;
    public Person (){}
    public Person (String name, String surname,String sex,LocalDate dateOfBirth){
        this.name = name;
        this.surname= surname;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

}
