package com.company;



public class Mouse extends AbstractAnimal {
    public Mouse (int age){
        super(age);
    }
    @Override
    public String toString (){
        return"mouse,age: "+getAge();
    }
}
