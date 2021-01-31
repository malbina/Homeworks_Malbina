package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        Kurs kurs = new Kurs("Programming", LocalDate.of(2020, 9, 25), "Java F-2020", "Sabina Temirbekova");
        System.out.println(kurs);
        System.out.println("_________________________");
        System.out.println();
        Group group = new Group(5, kurs, LocalDate.of(2020, 9, 25), 9);
        System.out.println(group);
        System.out.println("_________________________");
        System.out.println();

        Student students[] = new Student[group.getStudents().length];
        students[0] = new Student("Jesi", "female", "Johnson", LocalDate.of(2000, 9, 18));
        students[1] = new Student("Kris", "male", "Tomson", LocalDate.of(2001, 2, 12));
        students[2] = new Student("Kai", "male", "Lee", LocalDate.of(1998, 3, 26));
        students[3] = new Student("Kelly", "female", "Parkson", LocalDate.of(1998, 6, 23));
        students[4] = new Student("Mali", "female", "Klarson", LocalDate.of(1999, 8, 3));

        Lesson lesson = new Lesson(LocalDate.of(2020,11,25),students,kurs,LocalTime.of(14,00),true,false);
        System.out.println(lesson);
        System.out.println("__________________________\n");
        System.out.println("Студенты на уроке: \n");
        for (int i =0; i< students.length;i++){
            System.out.println(students[i]+"\n");
        }



        }


    }
