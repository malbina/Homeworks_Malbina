package com.company.classes;

import com.company.interfaces.Swimmable;

public class Shark implements Swimmable {
    @Override
    public void swim (){
        System.out.println("Shark swims really fast");
    }
    public void printInfo(){
        System.out.println("I'm shark and I love my life\n");
    }
}
