package com.company;

public class Dog extends AbstractAnimal {
    public Dog (int age){
        super(age);
    }
    @Override
    public String toString (){
        return"dog,age: "+getAge();
    }
}
