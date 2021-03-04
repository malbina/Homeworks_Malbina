package com.company;

import java.util.Objects;

public class Dog {
    private String name;
    private double weight;

    public Dog(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
   @Override
     public String toString(){
     return "Name: "+getName()+", Weight: "+getWeight();
     }

     @Override
     public boolean equals (Object obj){
        if(this==obj)return true;
        if(this instanceof Dog){
            Dog dog = (Dog)obj;
            return dog.getName().equals(this.getName()) && dog.getWeight()==this.getWeight();
        }
     return false;
     }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
