package com.company;

public class Farm {
    String adress;
    String name;
    String owner;
    Cow [] cows;
    Horse[] horses;
    Sheep [] sheeps;
    public Farm(String adress,String owner,int numOfCows,int numOfHorses,int numOfSheeps,String name){
        this.adress = adress;
        this.owner = owner;
        this.cows = new Cow[numOfCows];
        this.horses = new Horse[numOfHorses];
        this.sheeps = new Sheep[numOfSheeps];
        this.name =name;
    }
    public void printInfo (){
        System.out.println("Название фермы: " +getName()+"\nКоличество коров: "+getCows().length+"\n" +
                "Количество лошадей: "+ getHorses().length+"\nКоличество овцов: "+getSheeps().length+"\n" +
                "ФИО владельца "+getOwner()+"\nАдрес: "+getAdress());
        System.out.println();
    }





    public String getAdress() {
        return adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(String adress){
        this.adress = adress;
    }
    public String getOwner() {
        return owner;
    }
    public void setOwner (String owner){
        this.owner = owner;
    }
    public Cow[] getCows() {
        return cows;
    }
    public Horse[] getHorses() {
        return horses;
    }
    public Sheep[] getSheeps() {
        return sheeps;
    }
}
