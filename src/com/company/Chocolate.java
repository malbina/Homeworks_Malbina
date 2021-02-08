package com.company;

public class Chocolate extends Product {
    String producer;
    public Chocolate (){}
    public Chocolate (double weight,double price,String name,String producer){
        super (weight,price,name);
        this.producer = producer;
    }
    @Override
    public String toString(){
        String info = "\nChocolate: "+"\nName: "+getName()+"\nPrice: "+getPrice()+" EUR"+"\nWeight: "+getWeight()+" g"+"\nProducer: "+getProducer();
        return info;
    }
    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
