package com.company.person;
import com.company.person.Person;

import java.time.LocalDate;
public class Teacher extends Person {
   private  int age = LocalDate.now().getYear()-getDateOfBirth().getYear();
    private String subjectOfTeaching;
    public Teacher (){}
    public Teacher (String name, String surname,String sex,LocalDate dateOfBirth,String subjectOfTeaching){
        super(name,surname,sex,dateOfBirth);
        this.subjectOfTeaching=subjectOfTeaching;
    }
        @Override
        public String toString(){
        String info ="Teacher:\nName: "+getName()+"\nSurname: "+getSurname()+"\nAge: "+getAge()+"\nDate of birth: "+getDateOfBirth()+
                "\nTeaching's subject: "+getSubjectOfTeaching()+"\nSex: "+getSex();
        return info;
        }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSubjectOfTeaching() {
        return subjectOfTeaching;
    }

    public void setSubjectOfTeaching(String subjectOfTeaching) {
        this.subjectOfTeaching = subjectOfTeaching;
    }
}
