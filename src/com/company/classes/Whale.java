package com.company.classes;

import com.company.interfaces.Swimmable;

public class Whale implements Swimmable {
    @Override
    public void swim (){
        System.out.println("Oh my God I see now a whale und he's  swimming to me");
    }
    public void printInfo (){
        System.out.println("I'm a whale\n");
    }

}


