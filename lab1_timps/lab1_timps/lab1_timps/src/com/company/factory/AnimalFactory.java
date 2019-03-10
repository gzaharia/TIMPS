package com.company.factory;

import com.company.animal.Animal;
import com.company.animal.Cat;
import com.company.animal.Dog;

//Singleton design Pattern
//Factory design pattern
public class AnimalFactory implements AbstractFactory<Animal> {

    private AnimalFactory(){};

    @Override
    public Animal create(String animalType) {

        if ("Dog".equalsIgnoreCase(animalType)) {
            //the default parameters is send to dogBuilder
            return new Dog.DogBuilder()
                    .setTypeOfAnimal("Dog")
                    .setName("noName")
                    .setAge(0)
                    .build();
        } else if ("Cat".equalsIgnoreCase(animalType)) {
            return new Cat("Cat","noName",0);
        }

        return null;
    }

    private static class AnimalFactoryHelper{
        private static final AnimalFactory INSTANCE = new AnimalFactory();
    }

    public static AnimalFactory getInstance(){
        return AnimalFactoryHelper.INSTANCE;
    }


}
