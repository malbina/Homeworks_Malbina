package com.company;

public class Main {
    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        Holdable beast = new Beast();
        EatableFruits fruits = new Fruits();
        monkey.setEatableFruits(fruits);
        monkey.setHoldable(beast);
        System.out.println(monkey);
        monkey.print();

    }
}
