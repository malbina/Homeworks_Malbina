package com.company.classes;

import com.company.interfaces.Runnable;
import com.company.interfaces.Swimmable;

public class Human implements Runnable, Swimmable {
    @Override
    public void run (){
        System.out.println("Kevin runs every day to lose weight");
    }
    @Override
    public void swim (){
        System.out.println("Kevin swims in the pool two times a week");
    }
    public void printInfo (){
        System.out.println("I'm Kevin ind I'm a human\n");
    }
}
