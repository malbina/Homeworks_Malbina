package com.company;

import java.time.LocalDate;

public class Main  {
    public static void main(String[] args) {
        AbstractPopulationCenter [] cities = new City[3];
        cities[0] = new City("Hamburg", 5191042, 5092, LocalDate.of(1815, 6, 18), "Kevin Ebener");
        cities[1] = new City("Bremen", 1809567, 5734, LocalDate.of(1723, 9, 22), "Markus Knobloch");
        cities[2] = new City("Heidelberg", 98722, 3878, LocalDate.of(1534, 4, 11), "Ralf Breuer");

        AbstractPopulationCenter villages []=new Village[2];
        villages[0]=new Village("Theuern",11233,1232,LocalDate.of(1923,5,23),"Domenik Schmenk");
        villages[1]=new Village("Ebermannsdorf",3444,232,LocalDate.of(1967,8,6),"Henry Heiko");

        System.out.println("\nCities:\n");
        for(AbstractPopulationCenter city :cities){
           city.sayWhoIsAHead();
        }
        System.out.println("\nVillages:\n");

        for (int i =0; i< villages.length;i++){
            villages[i].sayWhoIsAHead();
        }



    }

}
