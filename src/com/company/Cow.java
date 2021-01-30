package com.company;

public class Cow {
    int age;
    String sex;
    double weight;
    String nickname;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>0)
        this.age = age;
    }

    public Cow(int age, String sex, double weight, String nickname) {
        setAge(age);
        this.sex = sex;
        this.weight = weight;
        this.nickname = nickname;
    }
    public Cow(){}

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
