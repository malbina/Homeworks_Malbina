package com.company;

import com.company.classes.*;
import com.company.interfaces.Flyable;
import com.company.interfaces.Runnable;
import com.company.interfaces.Swimmable;

public class Main {

    public static void main(String[] args) {
      Cat cat =new Cat ();
      Duck duck = new Duck();
      Human human = new Human();
      Parrot parrot= new Parrot();
      Plane plane = new Plane();
      Shark shark = new Shark();
      Ship ship = new Ship();
      Whale whale = new Whale();

      Swimmable swimmable []={ duck,human,shark,ship,whale};
      Flyable flyable[]={parrot,plane};
      Runnable runnable []={cat,human,duck,parrot};
      System.out.println("\nArray: Swimmable\n");
      for (Swimmable a : swimmable){
            a.swim();
            if(a instanceof Human) ((Human)a).printInfo();
            else if ( a instanceof Shark)((Shark) a).printInfo();
            else if (a instanceof Ship )((Ship) a).printInfo();
            else if (a instanceof Duck)((Duck)a).printInfo();
            else ((Whale)a).printInfo();}
      System.out.println("________________________________________________");
      System.out.println("\nClass: Flyable\n");
      for (Flyable a :flyable){
        a.fly();
        if(a instanceof Parrot)((Parrot)a).printInfo();
        else((Plane)a).printInfo();
      }
      System.out.println("___________________________________________________");
      System.out.println("\nArray: Runnable");
      for(Runnable a :runnable){
        a.run();
        if(a instanceof Cat)((Cat)a).printInfo();
        else if(a instanceof Human)((Human)a).printInfo();
        else if(a instanceof Duck)((Duck) a).printInfo();
        else ((Parrot)a).printInfo();
      }





    }
}
