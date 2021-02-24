package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cat> arrayListCats = Cat.generateArrayListFromCats(1000000);
        LinkedList<Cat>linkedListCats =Cat.generateLinkedListFromCats(1000000);

        long startingOfAdding =System.currentTimeMillis();
        Cat.addingCatsIntoMidOfList(arrayListCats,100);
        long endOfAdding =System.currentTimeMillis();
        System.out.println("Время на добавление 100 кошек в середину ArrayList: "+tellMeTimeForAProzess(startingOfAdding,endOfAdding));
        long starToAdd =System.currentTimeMillis();
        Cat.addingCatsIntoMidOfList(linkedListCats,100);
        long endToAdd =System.currentTimeMillis();
        System.out.println("Время добавления 100 кошек в середину LinkedList: "+tellMeTimeForAProzess(starToAdd,endToAdd));

        long timeOfStartingToAddFirst =System.currentTimeMillis();
        Cat.addFirst(arrayListCats,100);
        long timeOfEndingToAddFirst =System.currentTimeMillis();
        System.out.println("Время добавления 100 кошек в начало ArrayList: "+tellMeTimeForAProzess(timeOfStartingToAddFirst,timeOfEndingToAddFirst));
        long timeOfStartingtoAddFirstLinkedList = System.currentTimeMillis();
        Cat.addFirst(linkedListCats,100);
        long timeOfEndingToAddFirstLinkedList =System.currentTimeMillis();
        System.out.println("Время добавления 100 кошек в начало LinkedList: "+tellMeTimeForAProzess(timeOfStartingtoAddFirstLinkedList,timeOfEndingToAddFirstLinkedList));

        long timeOfStartingToAddLastLinkedList = System.currentTimeMillis();
        Cat.addLast(linkedListCats,100);
        long timeOfEndingToAddLastLinkedList = System.currentTimeMillis();
        System.out.println("Время добавления 100 кошек в конец LinkedList: "+tellMeTimeForAProzess(timeOfStartingToAddLastLinkedList,timeOfEndingToAddLastLinkedList));
       long timeOfStartingToAddLastArrList=System.currentTimeMillis();
        Cat.addLast(arrayListCats,100);
       long timeOfEndingToAddLastArrList =System.currentTimeMillis();
        System.out.println("Время добавления 100 кошек в конец ArrayList: "+tellMeTimeForAProzess(timeOfStartingToAddLastArrList,timeOfEndingToAddLastArrList));

        long timeOfStartingToGetElementsFromLinkedList =System.currentTimeMillis();









    }

    public static long tellMeTimeForAProzess (long timeOfStart,long timeOfEnd){
        return timeOfEnd-timeOfStart;
    }
}