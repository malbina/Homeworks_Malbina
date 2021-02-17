package com.company.classes;

import com.company.interfaces.Flyable;
import com.company.interfaces.Runnable;

public class Parrot implements Flyable, Runnable {
    @Override
    public void run (){
        System.out.println("My parrot is running to me know! ");
    }
    @Override
    public void fly (){
        System.out.println("My parrot can fly!");
    }
    public void printInfo(){
        System.out.println("I'm a parrot und can speak German\n");
    }
}
