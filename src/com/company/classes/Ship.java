package com.company.classes;

import com.company.interfaces.Swimmable;

public class Ship implements Swimmable {
    @Override
    public void swim (){
        System.out.println("We have a Problem ! Ship isn't swimming");
    }
    public void printInfo (){
        System.out.println("I'm a ship from Titanik\n");
    }
}
