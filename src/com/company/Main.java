package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World, I'm Malbina ");
        Person student1 = new Person("Эмилия","Эсенова", " Кайратовна",2000,"женский");
        Person student2 = new Person("Урмат","Арзыков","Усенович",2001,"мужской");
        student2.setHobby("Плавание и рисование");
        Person student3 = new Person ("Айгерим", "Асанова", "Толкунбекова",1999,"женский");
        Person student4 = new Person ("Арсен", "Эмиров", "Кулматович", 1998,"мужской");
        Person student5 = new Person("Гарри","Поттеров", "Грифиндоривич", 1997,"мужской");
        student5.setHobby("Изучение магии ");
        Person student6 = new Person(" Ли ","Мин","Хо",1985,"мужской");
        student6.setHobby("Смотреться в зеркале и любоваться своей сногшибательностью");
        Person student7 = new Person(" Повел","Воля","Ляйсанович",1979,"мужской");
        student7.setHobby("Признаваться в любви своей жене, ну и конечно шутить и шутить:)");
        Person student8 = new Person("Вольфганг","Моцарт","Адеймос",1887,"мужской");
        student8.setHobby("Создание опер, которые будут слушать каждое поколение.");
        Person student9 = new Person("Ки","Дже","Чан",1967,"мужской");
        student9.setHobby("Люблю снимать и сниматься в кино");
        Person student10 = new Person("Jony","Хитмейкер","Всемилюбимец",1995,"мужской");
        student10.setHobby("Создавать хитовые песни , классно их исполнять . Ну и просто быть идеальным.");
        Person [] persons = {student1,student2,student3,student4,student5,student6,student7,student8,student9,student10};

        for(int i =0; i< persons.length; i++){
            persons[i].getInfo();
        }





    }
}
