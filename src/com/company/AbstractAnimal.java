package com.company;

public  abstract class AbstractAnimal {
    private int age;

    public AbstractAnimal(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
