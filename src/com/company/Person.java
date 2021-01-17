package com.company;

import java.time.LocalDate;

public class Person {
    String name;
    String surname;
    String middleName;
    int birthYear;
    String gender;
    String hobby;

    public Person(String name, String surname, String middleName, int birthYear, String gender) {
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        setBirthYear(birthYear);
        this.gender = gender;
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

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = LocalDate.now().getYear() - birthYear;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void getInfo(){
        System.out.println("ФИО: "+getSurname()+" " +getName()+" "+getMiddleName()+"\n"+
                "Возраст:"+getBirthYear()+ "\n"+"Пол: "+getGender());
        if(getHobby()!=null){
            System.out.println("Хобби: "+getHobby());
            System.out.println();
        }else{
            System.out.println();
        }
    }



}
