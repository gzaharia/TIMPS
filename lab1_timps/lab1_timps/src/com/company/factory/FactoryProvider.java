package com.company.factory;


public class FactoryProvider {


    public static AbstractFactory getFactory(String choice){

        if("Animal".equalsIgnoreCase(choice)){
            return AnimalFactory.getInstance();
        } else if("Toy".equalsIgnoreCase(choice)){
            return ToyFactory.getInstance();
        }

        return null;
    }

}
