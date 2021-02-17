package com.company.classes;

import com.company.interfaces.Flyable;

public class Plane implements Flyable {
    @Override
    public void fly (){
        System.out.println("Everybody knows  every plane can fly");
    }
    public void printInfo (){
        System.out.println("I'm a plane from Canada\n");
    }
}
