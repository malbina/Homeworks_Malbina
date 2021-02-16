package com.company;

public class Beast implements Holdable {
    public void hold (){
        System.out.println("Monkey holds a beast");
    }
    @Override
    public String toString (){
        return "Beast";
    }
}
