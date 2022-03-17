package com.company;

public class Animal {
    private String name;
    private int id;
    private int weight;

    public Animal(String name, int id, int weight) {
      this.name = name;
      this.id = id;
      this.weight = weight;
    }

    // FIXME added getter and setter
    public String getName(){
        return name;
    }
    public int getWeight(){
        return weight;
    }
}
