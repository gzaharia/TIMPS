## TIMPS Laboratory Work Nr.2


### Prerequisites:
  - Design patterns
  - Structural design patterns
  - Organize and structure the application using structural design patterns.

### Objectives:
  - Study structural design patterns
  - Develop a project using 5 structural design patterns
  - Ensure connection between patterns
 
 ### Tasks: 
 -  Create an application using 5 design structural patterns : 
    - Adapter
    - Bridge
    - Composite
    - Flyweight
    - Decorator 
    
 ### Implementation of task: 
 
 In this laboratory work I have continued the studying about Design Patterns, but this time about **Structural**. The structural design patterns are concerned with how classes and objects arecomposed to form larger structures.Structural class patterns use inheritance to compose interfacesor implementations. In this case imagine how to combine the multiple inheritance mixes many classes into one. A result is a class that combines the properties of its parent classes. 
 
 So let's analyze the Strucutural patterns implementation according to my application.
 
 **Adapter** 
 
 The adapter pattern provides an interface , which perform a uniform abstractization of different interfaces. The classes that working with Adapter pattern should work together because this have the same interface. All of the design pattern come to solve an problem , structural , creatioal or behavioral. So, the adapter we should use then : 
 - you need to use several subclasses for an object , but it's not good, because you should have an interface for each object from subclass.
 - ensure the good communication between interfaces and objects. 
 
 My application in this laboratory work is about contructions/buildings. So, for adapter pattern I have implemented the **Override** methods, which can perform the creation , adding , removing and clear the building objects. For this, I have created an interface and I have the City parent class. The City parent class has the List of all contructions. 
 
 ![](https://github.com/gzaharia/TIMPS/blob/master/lab2_tmps/Screens/targetInterface.PNG)
 
 ![](https://github.com/gzaharia/TIMPS/blob/master/lab2_tmps/Screens/Adapter.PNG)
