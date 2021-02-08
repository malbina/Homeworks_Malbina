package com.company;

public class Product {
    double weight;
    double price;
    String name;
    public Product (){}
    public Product (double weight,double price,String name){
        this.weight = weight;
        this.price = price;
        this.name =name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
