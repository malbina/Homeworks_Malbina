package com.company;

import java.time.LocalDate;

public class City extends AbstractPopulationCenter {

    public City() {
    }

    public City(String name, double population, double area, LocalDate based,String head) {
        super(name, population, area, based,head);
    }

    @Override
    public void sayWhoIsAHead (){
     System.out.println("The head of "+getName()+" is "+getHead());

 }

}
