package com.company;

public class MeatCow extends Animal {

    private int meatWeight;

    public MeatCow(String name, int id, int weight, int meatWeight) {
        super(name, id, weight);
        this.meatWeight = meatWeight;
    }

    public int getMeatWeight() {
        return meatWeight;
    }

    public void setMeatWeight(int meatWeight) {
        this.meatWeight = meatWeight;
    }

    //FIXME Ошибка, это должно быть в Animal, так как поля только там



}
