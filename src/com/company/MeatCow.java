package com.company;

public class MeatCow extends Animal {

    private int meatWeight;

    public MeatCow(String name, int id, int weight, int meatWeight) {
        super(name, id, weight);
        this.meatWeight = meatWeight;
    }

    public int getWeight(){
        return weight;
    }
    public String getName(){
        return name;
    }









}
