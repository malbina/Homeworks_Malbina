package com.company;

public class NewCat extends AbstractAnimal {
    public NewCat(int age){
        super(age);
    }
    @Override
    public String toString (){
        return"cat,age: "+getAge();
    }
}
