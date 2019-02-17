## TIMPS Laboratory Work Nr.1


### Prerequisites:
  - Design patterns
  - Creational design patterns
  - Structure the project using design patterns

### Objectives:
  - Study creational design patterns
  - Develop a project using 5 creational design patterns
  - Ensure connection between patterns
 
 ### Tasks: 
 -  Create an application using 5 design creational patterns : 
    - Builder
    - Abstract Factory
    - Factory
    - Singleton
    - Prototype
    
 ### Implementation of task: 
Before starting performing this laboratory work I have studied about design patterns and what is the purpose of usign them into some projects, what are advantages. Also, I have studied each design pattern and I have tried to understand how it works. According to the tasks I chose to perform an console application, which will print something in console. So , I chose simple application which has one parent classes and child classes.


### Builder pattern
It is creational design pattern which operate with creating the complex objects and we need to use when the process involved in creating an object is extremely complex, with lots of mandatory and optional parameters.

 ![](https://github.com/gzaharia/BDC_Labs/blob/master/Laboratory_Work_N10/Screens/Task3.PNG)  

In my project the builder pattern helps me to create the Dog ( child of the Animal parent class) which has from parent class the constants : typeOfAnimal, name and age. Here , I have an DogBuilder which helps me to instantiate an object of Dog type with parameters which were set by default in DogBuilder (according to the purpose of Builder pattern). 


### Abstract Factory
Abstract Factory pattern helps us to create factory of related objects. In my case create objects inherited from Animal parent class or from Toy parent class. ( This pattern is connected with Factory).


### Factory
Factory pattern it is used for creating subclasses having one or several super classes(parent). For implementing this pattern I have AnimalFactory class, which create the object (subclass object , child) : Dog or Cat with default parameters which will be send to the DogBuilder in case of of Dog(connection between Factory pattern and Builder). Also, for instantiating only once and restrict accessing from another classes I have used the ** Singleton pattern**.


### Singleton
Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists in the java virtual machine. I have used this in contrast with Factory pattern.


### Prototype
Prototype pattern it is used for cloning the original object to the new and if it is needed modify the parameters. 
