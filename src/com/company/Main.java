package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Dog> dogsList=new ArrayList<>();

        String [] names = {"Ela","Bella","Kris","Sky","Sunny","Uli","Ela","Lulu","Luis","Lena"};
        int indNames=0;
        for(int i =0;i<4;i++){
            for(int j=0;j<10;j++){
                dogsList.add(new Dog(names[j],j+1));
            }
        }
        System.out.println("ArrayList c дубликатами: "+dogsList);
       Set<Dog> hashDogs = new HashSet<>(dogsList);
        System.out.println("HashSet c уникальными значениями: "+hashDogs);



    }
}
