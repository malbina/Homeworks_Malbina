package com.company;

import java.time.LocalDate;

public class Village extends AbstractPopulationCenter {
    @Override
    public void sayWhoIsAHead (){
        System.out.println("The head of "+getName()+" is "+getHead());
    }

    public Village() {
    }

    public Village(String name, double population, double area, LocalDate based,String head) {
        super(name, population, area,based,head);
    }
}
