package com.company;

public class MilkCow extends Animal {

    private int milkLiter;

    public MilkCow(String name, int id, int weight, int milkLiter) {
        super(name, id, weight);
        this.milkLiter = milkLiter;
    }

    public void whatToDo() {
        if (milkLiter < 15) // FIXME add {}
            System.out.println("пустить на мясо " + name); //FIXME use getName
        else // FIXME add {}
            System.out.println("продолжать доить " + name);
    }


}
