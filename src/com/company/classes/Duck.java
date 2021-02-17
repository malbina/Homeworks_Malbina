package com.company.classes;

import com.company.interfaces.Flyable;
import com.company.interfaces.Runnable;
import com.company.interfaces.Swimmable;

public class Duck implements Swimmable, Runnable, Flyable {
    @Override
    public void run (){
        System.out.println("Duck is running! It's awesome");
    }
    @Override
    public void swim (){
        System.out.println("Duck can swim");
    }
    @Override
    public void fly (){
        System.out.println("This duck is flying now! It's so amazing");
    }
    public void printInfo (){
        System.out.println("I'm a duck and I'm pretty\n");
    }
}
