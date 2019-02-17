package com.company.toy;

public abstract class Toy {

    private String color;
    private int price;

    public Toy(){}

    public Toy(String color, int price) {
        this.color = color;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract void getTypeOfToy();
}
