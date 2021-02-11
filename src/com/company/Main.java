package com.company;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
     Credit credit1= new Credit("Emil Kasanov",50000,6,1);
     Credit credit2 = new Credit("Asel Kadyrova",35000,12,3);
     Credit credit3 = new Credit("Arstan Usenov",45000,18,2);
     Credit credit4 = new Credit("Kairat Alymbekov",25000,12,9);
     Credit credit5 = new Credit("Janyl Aibekova",245000,12,10);
     Credit.getCreditInfo();
    }
}
