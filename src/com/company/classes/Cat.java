package com.company.classes;

import com.company.interfaces.Runnable;

public class Cat implements Runnable {
    @Override
    public void run (){
        System.out.println("Cat is running to catch a mouse!");
    }
    public void printInfo (){
        System.out.println("I'm a cat and I fond of sleeping\n");
    }
}
