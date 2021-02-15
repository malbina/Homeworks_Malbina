package com.company;

import java.time.LocalDate;

public abstract class AbstractPopulationCenter {
    private String name;
    private double population;
    private double area;
    private LocalDate based;
    private String head;
    public AbstractPopulationCenter (){}
    public AbstractPopulationCenter(String name, double population, double area, LocalDate based,String head ) {
        this.name = name;
        this.population = population;
        this.area = area;
        this.based = based;
        this.head=head;
    }
    public abstract void sayWhoIsAHead ();



    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public LocalDate getBased() {
        return based;
    }

    public void setBased(LocalDate based) {
        this.based = based;
    }
}
