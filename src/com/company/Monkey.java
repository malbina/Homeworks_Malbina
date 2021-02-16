package com.company;

public class Monkey implements Climbable {

private Holdable holdable;
private EatableFruits eatableFruits;

public void print (){
    System.out.println("I'm eating "+getEatableFruits()+" and I can hold a "+getHoldable()+" on my back:)");
}
@Override
public String toString (){
    return "I'm a happy monkey!";
}

@Override
public void climb (){
    System.out.println("Monkey climbs");
}

    public EatableFruits getEatableFruits() {
        return eatableFruits;
    }

    public void setEatableFruits(EatableFruits eatableFruits) {
        this.eatableFruits = eatableFruits;
    }

    public Holdable getHoldable() {
        return holdable;
    }

    public void setHoldable(Holdable holdable) {
        this.holdable = holdable;
    }
}
