package com.company.factory;

import com.company.toy.BoneToy;
import com.company.toy.FishToy;
import com.company.toy.Toy;

//Singleton design Pattern
//Factory design pattern
public class ToyFactory implements AbstractFactory<Toy> {
    private ToyFactory(){};

    @Override
    public Toy create(String animalType) {

        if ("BoneToy".equalsIgnoreCase(animalType)) {
            //the default parameters is send to dogBuilder
            return new BoneToy();
        } else if ("FishToy".equalsIgnoreCase(animalType)) {
            return new FishToy();
        }

        return null;
    }

    private static class ToyFactoryHelper{
        private static final ToyFactory INSTANCE = new ToyFactory();
    }

    public static ToyFactory getInstance(){
        return ToyFactoryHelper.INSTANCE;
    }
}
