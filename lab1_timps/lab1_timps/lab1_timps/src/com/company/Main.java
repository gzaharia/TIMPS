package com.company;

import com.company.animal.Animal;
import com.company.animal.Cat;
import com.company.animal.Dog;
import com.company.factory.AnimalFactory;
import com.company.factory.FactoryProvider;
import com.company.factory.ToyFactory;
import com.company.toy.BoneToy;
import com.company.toy.FishToy;
import com.company.toy.Toy;

public class Main {

    public static void main(String[] args) {
        //get animal factory (abstract factory design pattern)
        AnimalFactory animalFactory = (AnimalFactory) FactoryProvider.getFactory("Animal");
        createAnimals(animalFactory);

        ToyFactory toyFactory = (ToyFactory) FactoryProvider.getFactory("Toy");
        createToys(toyFactory);

    }


    public static void createAnimals(AnimalFactory animalFactory) {
        //create dog using animal factory (factory design pattern)
        Animal dog = animalFactory.create("Dog");
        Animal cat1 = animalFactory.create("Cat");

        Animal cat2 = null;
        try {
            //create cat2 with clone() method (prototype design pattern)
            cat2 = (Animal) ((Cat) cat1).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        cat2.setName("Tom");
        cat2.setAge(2);

        System.out.println("\n\t Type of Animals and sounds they do: ");
        System.out.println(dog);
        dog.makeSound();
        System.out.println(cat1);
        cat1.makeSound();
        System.out.println(cat2);
        cat2.makeSound();

    }

    public static void createToys(ToyFactory toyFactory) {

        System.out.println("\n\n\t Type of toys we have: ");
        Toy fishToy = toyFactory.create("FishToy");
        Toy boneToy = toyFactory.create("BoneToy");
        fishToy.getTypeOfToy();
        boneToy.getTypeOfToy();

    }


}
