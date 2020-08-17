package com.company;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("\tDog is chewing...");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating!");
        chew();
    }

    @Override
    public void move() {
        System.out.println("Dog is moving!");
    }
}