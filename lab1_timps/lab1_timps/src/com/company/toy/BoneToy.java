package com.company.toy;

public class BoneToy extends Toy{

    public BoneToy(){}

    public BoneToy(String color, int price){
        super(color,price);
    }

    @Override
    public void getTypeOfToy() {
        System.out.println("It is a bone toy");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new BoneToy(this.getColor(), this.getPrice());
    }
}
