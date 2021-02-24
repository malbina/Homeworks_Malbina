package com.company;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Cat {

public static ArrayList generateArrayListFromCats (int sizeOfArrayList) {
    ArrayList<Cat> arrayListFromCats = new ArrayList<>();
    for (int i = 0; i < sizeOfArrayList; i++) {
        arrayListFromCats.add(new Cat());
    }
    return arrayListFromCats;
}
public static LinkedList generateLinkedListFromCats(int sizeOfLinkedList) {
        LinkedList<Cat> linkedListFromCats = new LinkedList<>();
    for (int i = 0; i < sizeOfLinkedList; i++){
        linkedListFromCats.add(new Cat());
        }return linkedListFromCats;
    }
public static List addingCatsIntoMidOfList(List<Cat> objectList,int countOfAddingsCat){
    for(int i =0;i<countOfAddingsCat;i++) {
            objectList.add((objectList.size()-1)/2,new Cat());
    }return objectList;
}
public static LinkedList addFirst(LinkedList<Cat> cats, int countOfAddingsCat){
    for(int i =0;i<countOfAddingsCat;i++){
        cats.addFirst(new Cat());
    }return cats;
}
public static ArrayList addFirst (ArrayList<Cat> cats,int countOfAddingsCat){
    for(int i =0;i<countOfAddingsCat;i++){
        cats.add(0,new Cat());
    }return cats;
}
public static List addLast (LinkedList<Cat>cats,int countOfAddingsCat){
    for(int i =0;i<countOfAddingsCat;i++){
        cats.addLast(new Cat());
    }return cats;
}
public  static ArrayList addLast (ArrayList<Cat> cats,int countOfAddingsCat){
    for(int i =0;i<countOfAddingsCat;i++){
        cats.add(new Cat());
    }return cats;
}
    @Override
public String toString (){
    return "cat";
}




}
