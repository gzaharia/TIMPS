package com.company.animal;

//Prototype pattern
public class Cat extends Animal {


    public Cat(String typeOfAnimal, String name, int age) {
        super(typeOfAnimal,name, age);
    }


    @Override
    public void makeSound() {
        System.out.println("Cat sound!");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Cat(this.getTypeOfAnimal() ,this.getName(), this.getAge());
    }


}
