package com.company.caller;

import com.company.person.Student;
import com.company.person.Teacher;

import java.time.LocalDate;


public class Main {

    public static void main(String[] args) {

     Student stud = new Student("Martin","Johnson","male",LocalDate.of(2000,8,29),"Management");
     Teacher teacher = new Teacher("Almaz","Isakov","male",LocalDate.of(1990,9,8),"Informatik");
        System.out.println(stud);
        System.out.println("\n\n");
        System.out.println(teacher);




        }


    }
