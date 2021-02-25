package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cat> arrayListCats = Cat.generateArrayListFromCats(1000000);
        LinkedList<Cat> linkedListCats = Cat.generateLinkedListFromCats(1000000);

        long startingOfAdding = System.currentTimeMillis();
        Cat.addingCatsIntoMidOfList(arrayListCats, 100);
        long endOfAdding = System.currentTimeMillis();
        System.out.println("Время на добавление 100 кошек в середину ArrayList: " + tellMeTimeForAProzess(startingOfAdding, endOfAdding));
        long starToAdd = System.currentTimeMillis();
        Cat.addingCatsIntoMidOfList(linkedListCats, 100);
        long endToAdd = System.currentTimeMillis();
        System.out.println("Время добавления 100 кошек в середину LinkedList: " + tellMeTimeForAProzess(starToAdd, endToAdd));

        long timeOfStartingToAddFirst = System.currentTimeMillis();
        Cat.addFirst(arrayListCats, 100);
        long timeOfEndingToAddFirst = System.currentTimeMillis();
        System.out.println("\nВремя добавления 100 кошек в начало ArrayList: " + tellMeTimeForAProzess(timeOfStartingToAddFirst, timeOfEndingToAddFirst));
        long timeOfStartingtoAddFirstLinkedList = System.currentTimeMillis();
        Cat.addFirst(linkedListCats, 100);
        long timeOfEndingToAddFirstLinkedList = System.currentTimeMillis();
        System.out.println("Время добавления 100 кошек в начало LinkedList: " + tellMeTimeForAProzess(timeOfStartingtoAddFirstLinkedList, timeOfEndingToAddFirstLinkedList));

        long timeOfStartingToAddLastLinkedList = System.currentTimeMillis();
        Cat.addLast(linkedListCats, 100);
        long timeOfEndingToAddLastLinkedList = System.currentTimeMillis();
        System.out.println("\nВремя добавления 100 кошек в конец LinkedList: " + tellMeTimeForAProzess(timeOfStartingToAddLastLinkedList, timeOfEndingToAddLastLinkedList));
        long timeOfStartingToAddLastArrList = System.currentTimeMillis();
        Cat.addLast(arrayListCats, 100);
        long timeOfEndingToAddLastArrList = System.currentTimeMillis();
        System.out.println("Время добавления 100 кошек в конец ArrayList: " + tellMeTimeForAProzess(timeOfStartingToAddLastArrList, timeOfEndingToAddLastArrList));

        long timeOfStartingToGetElementFromLinkedList = System.currentTimeMillis();
        linkedListCats.get((linkedListCats.size() - 1) / 2);
        linkedListCats.getLast();
        long timeOfEndingToGetElementFromLinkedList = System.currentTimeMillis();
        System.out.println("\nВремя получения одного элемента из cередины и конца  LinkedList: " + tellMeTimeForAProzess(timeOfStartingToGetElementFromLinkedList, timeOfEndingToGetElementFromLinkedList));
        long timeOfStartingToGetElementFromArrList = System.currentTimeMillis();
        arrayListCats.get((arrayListCats.size() - 1) / 2);
        int arrListInd = arrayListCats.size() - 1;
        arrayListCats.get(arrListInd);
        long timeOfEndingToGetElementFromArrList = System.currentTimeMillis();
        System.out.println("Время получения одного элемента из середины и конца ArrayList: " + tellMeTimeForAProzess(timeOfStartingToGetElementFromArrList, timeOfEndingToGetElementFromArrList));

        long timeOfStartingToRemoveLinkedList = System.currentTimeMillis();
        linkedListCats.remove((linkedListCats.size() - 1) / 2);
        linkedListCats.removeFirst();
        long timeOfEndingToRemoveLinkedList = System.currentTimeMillis();
        System.out.println("\nУдаление из середины и в начале LinkedList: " + tellMeTimeForAProzess(timeOfEndingToRemoveLinkedList, timeOfEndingToRemoveLinkedList));
        long timeOfStartingToRemoveArrList = System.currentTimeMillis();
        arrayListCats.remove((arrayListCats.size() - 1) / 2);
        arrayListCats.remove(0);
        long timeOfEndingToRemoveArrList = System.currentTimeMillis();
        System.out.println("Удаление из середины и в начале ArrayList: " + tellMeTimeForAProzess(timeOfEndingToRemoveArrList, timeOfEndingToRemoveArrList));

        // Task B
        LinkedList<AbstractAnimal> animals = new LinkedList<>();
        ArrayList<AbstractAnimal> animalsArrayList = new ArrayList<>();
        LinkedList<AbstractAnimal> lastListOfAnimal = new LinkedList<>();
        for (int i = 0; i <= 50; i++) {
            animals.add(new Dog(i + 1));
            animals.add(new NewCat(i + 1));
        }
        int countCats = 0, countDogs = 0;
        int ageOfCats=0, ageOfDogs =0, ageOfMouses =0;
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i) instanceof NewCat) {
                countCats++;
              ageOfCats+=animals.get(i).getAge();
                if (countCats == 5) {
                    animals.remove(i);
                    countCats = 0;
                }
            }
            if (animals.get(i) instanceof Dog) {
                AbstractAnimal dogForArrList =animals.get(i);
                countDogs++;
                animalsArrayList.add(dogForArrList);
                ageOfDogs+= animals.get(i).getAge();
                if (countDogs % 3 == 0) {
                    AbstractAnimal mouse = new Mouse (2);
                    animals.add(i + 1, mouse);
                    animalsArrayList.add(mouse);
                   ageOfMouses+= mouse.getAge();
                }
            }
        }
        System.out.println("\nКаждая пятая кошка удалена и после каждой третьей собаки идет мышка\n");
        System.out.println(animals);

        LinkedList<AbstractAnimal> newAnimalLinkedList = new LinkedList<>();
        for(int i =0;i< animals.size()-1;i++){
            AbstractAnimal animalInd1 = animals.get(i);
            AbstractAnimal animalInd2 = animals.get(i+1);
            if(animalInd1 instanceof NewCat && animalInd2 instanceof Mouse ||
            animalInd1 instanceof Mouse && animalInd2 instanceof NewCat){
               newAnimalLinkedList.add(animalInd1);
               newAnimalLinkedList.add(animalInd2);
            }
    }
        System.out.println("\nLinked list из кошек и мышек\n"+newAnimalLinkedList);
        System.out.println("\nArray List из мышек и собак \n"+animalsArrayList);
        System.out.println("\n\nСумма возрастов кошек: "+ageOfCats);
        System.out.println("Сумма возрастов собак: "+ageOfDogs);
        System.out.println("Сумма возрастов мышек: "+ageOfMouses);

        for(AbstractAnimal animal : animals){
            if(animal instanceof Dog)
                lastListOfAnimal.add((lastListOfAnimal.size()-1)/2,animal);
            else if(animal instanceof NewCat)
                lastListOfAnimal.addFirst(animal);
            else lastListOfAnimal.addLast(animal);
        }
        System.out.println("\nLinked List в начале кошки, в середине собаки,в конце мышки\n"+lastListOfAnimal);

        }













    public static long tellMeTimeForAProzess (long timeOfStart,long timeOfEnd){
        return timeOfEnd-timeOfStart;
    }
}