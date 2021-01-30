package com.company;

public class Horse {
 int  age;
 String nickname;
 double weight;
 String colour;
 String sex;


    public Horse(int age, String nickname, double weight, String colour, String sex) {
         setAge(age);
        this.nickname = nickname;
        this.weight = weight;
        this.colour = colour;
        this.sex = sex;
    }
    public Horse (){}

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0)
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
