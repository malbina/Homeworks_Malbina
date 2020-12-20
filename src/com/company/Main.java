package com.company;

public class Main {

    public static void main(String[] args) {
        Student student1 =new Student();
        student1.firstName = "Malbina";
        student1.lastName = " Ramil Kyzy";
        student1.birthplace = " Bishkek";
        student1.age = 20;
        student1.yearOfStudy = 2;
        student1.faculty =" Informatik";

        Student student2 = new Student();
        student2.firstName = "Marat";
        student2.lastName = "Basharov";
        student2.birthplace = " Kara -Kol";
        student2.age = 21;
        student2.yearOfStudy = 3;
        student2.faculty = " Biology";

        Student student3 = new Student ();
        student3.firstName = " Alina";
        student3.lastName = " Kalysova";
        student3.birthplace = "Naryn";
        student3.age = 20;
        student3.yearOfStudy = 2;
        student3.faculty = " Management";


        System.out.printf( " Student №1: \n  First name : %s \n Last name : %s\n Birthplace : %s" +
                        "\n Age of student : %d \n The year of study : %d \n Student's faculty : %s\n",
                student1.firstName, student1.lastName, student1.birthplace,student1.age,
                student1.yearOfStudy,student1.faculty);

        System.out.printf( " Student №2: \n  First name : %s \n Last name : %s\n Birthplace : %s" +
                        "\n Age of student : %d \n The year of study : %d \n Student's faculty : %s\n",
                student2.firstName, student2.lastName, student2.birthplace,student2.age,
                student2.yearOfStudy,student2.faculty);

        System.out.printf( " Student №3: \n  First name : %s \n Last name : %s\n Birthplace : %s" +
                        "\n Age of student : %d \n The year of study : %d \n Student's faculty : %s\n",
                student3.firstName, student3.lastName, student3.birthplace,student3.age,
                student3.yearOfStudy,student3.faculty);

        // B

        Film film1 = new Film();
        film1.movieTitle = "The Shawshank Redemption";
        film1.yearOfProduction = 1994;
        film1.producingCountry = "USA";
        film1.filmGenre = " drama";

        Film film2 = new Film();
        film2.movieTitle = " The Green Mile";
        film2.yearOfProduction = 1999;
        film2.producingCountry ="USA";
        film2.filmGenre = "science fiction, drama, crime, detective ";

        System.out.printf(" The film №1 \n The name of a movie: %s\n The year of Production : %d\n" +
                        "Producing country : %s\n Film genre: %s\n ", film1.movieTitle, film1.yearOfProduction,
                film1.producingCountry, film1.filmGenre);
        System.out.printf(" The film №2 \n The name of a movie: %s\n The year of Production : %d\n" +
                        "Producing country : %s\n Film genre: %s\n ", film2.movieTitle, film2.yearOfProduction,
                film2.producingCountry, film2.filmGenre);
    }
}
