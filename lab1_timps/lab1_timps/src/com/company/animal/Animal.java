package com.company.animal;

public abstract class Animal {

    private String typeOfAnimal;
    private String name;
    private int age;


    public Animal() {
    }


    public Animal(String typeOfAnimal, String name, int age) {
        this.typeOfAnimal = typeOfAnimal;
        this.name = name;
        this.age = age;
    }

    public String getTypeOfAnimal() {
        return typeOfAnimal;
    }

    public void setTypeOfAnimal(String typeOfAnimal) {
        this.typeOfAnimal = typeOfAnimal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void makeSound();

    @Override
    public String toString() {
        return "Animal{" +
                "typeOfAnimal='" + typeOfAnimal + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
