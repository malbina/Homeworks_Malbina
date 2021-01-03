package com.company;

public class Main {

    public static void main(String[] args){
    Cat cat = new Cat ();
    cat.setTypeOfAnimal("Кошка");
    cat.setName("Эли ");
    cat.setAge(3);
    cat.setWeight(2.2);
    cat.setBreed("Персидская кошка");
    cat.sayAboutMe();

    Dog dog = new Dog();
    dog.setTypeOfAnimal("Собака ");
    dog.setName (" Ральф");
    dog.setAge(5);
    dog.setWeight(3.5);
    dog.setBreed("Немецкая овчарка ");
    dog.sayAboutMe();

    Parrot parrot = new Parrot();
    parrot.setTypeOfAnimal("Попугай");
    parrot.setName("Папагай");
    parrot.setAge(2);
    parrot.setWeight(1);
    parrot.setBreed("Корелла");
    parrot.sayAboutMe();

    Fish fish = new Fish();
    fish.setTypeOfAnimal("Рыба");
    fish.setName("Рыбаня");
    fish.setAge(1);
    fish.setWeight(0.89);
    fish.setBreed("Глазчатый астронотус");
    fish.sayAboutMe();









    }


}
