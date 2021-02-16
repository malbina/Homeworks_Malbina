package com.company;

public class Fruits implements EatableFruits{
    public void eat (){
        System.out.println("Monkey eats fruits");
    }
    @Override
    public String toString (){
        return "Fruits";
    }
}
