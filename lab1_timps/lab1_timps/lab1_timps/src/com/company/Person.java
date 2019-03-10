package com.company;

import com.company.animal.Animal;

import java.util.List;

public class Person {

    private String name;
    private String surname;
    private String age;
    private String sex;

    private List<Animal> animals;

    private Person(PersonBuilder personBuilder){
        this.name = personBuilder.name;
        this.surname = personBuilder.surname;
        this.age = personBuilder.age;
        this.sex = personBuilder.sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public static class PersonBuilder{
        private String name;
        private String surname;
        private String age;
        private String sex;

        private List<Animal> animals;


        public PersonBuilder(){}

        public PersonBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public PersonBuilder setAge(String age) {
            this.age = age;
            return this;
        }

        public PersonBuilder setSex(String sex) {
            this.sex = sex;
            return this;
        }

        public PersonBuilder setAnimals(List<Animal> animals) {
            this.animals = animals;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }
}
