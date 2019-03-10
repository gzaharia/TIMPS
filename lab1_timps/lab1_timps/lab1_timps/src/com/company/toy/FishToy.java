package com.company.toy;

public class FishToy extends Toy {

    public FishToy() {
    }

    public FishToy(String color, int price) {
        super(color, price);
    }

    @Override
    public void getTypeOfToy() {
        System.out.println("It is a fish toy");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new FishToy(this.getColor(), this.getPrice());
    }
}
