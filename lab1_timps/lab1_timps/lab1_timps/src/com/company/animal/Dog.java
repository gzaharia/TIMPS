package com.company.animal;

//Builder pattern
public class Dog extends Animal {


    private Dog(DogBuilder dogBuilder) {
        super(dogBuilder.typeOfAnimal ,dogBuilder.name, dogBuilder.age);
    }


    @Override
    public void makeSound() {
        System.out.println("Dog sound!");
    }

    public static class DogBuilder {

        private String typeOfAnimal;
        private String name;
        private int age;

        public DogBuilder() {

        }

        public DogBuilder setTypeOfAnimal(String typeOfAnimal){
            this.typeOfAnimal = typeOfAnimal;
            return this;
        }

        public DogBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public DogBuilder setAge(int age) {
            this.age = age;
            return this;
        }


        public Dog build() {
            return new Dog(this);
        }


    }


}
