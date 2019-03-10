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
 
 ### Adapter
 
 The adapter pattern provides an interface , which perform a uniform abstractization of different interfaces. The classes that working with Adapter pattern should work together because this have the same interface. All of the design pattern come to solve an problem , structural , creatioal or behavioral. So, the adapter we should use then : 
 - you need to use several subclasses for an object , but it's not good, because you should have an interface for each object from subclass.
 - ensure the good communication between interfaces and objects. 
 
 **Solved Problem :** organizing the object and ensuring the compatibility between them.
 
 My application in this laboratory work is about contructions/buildings. So, for adapter pattern I have implemented the **Override** methods, which can perform the creation , adding , removing and clear the building objects. For this, I have created an interface and I have the City parent class. The City parent class has the List of all contructions. 
 
 ![](https://github.com/gzaharia/TIMPS/blob/master/lab2_tmps/Screens/targetIterface.PNG)
 
 ![](https://github.com/gzaharia/TIMPS/blob/master/lab2_tmps/Screens/Adapter.PNG) 
 
 ### Bridge 
 
 The Bridge structural pattern publish the interface to an inheritance hierarchy and decouple an abstractization so that the two can vary independently. So , the bridge pattern should be used in case of modifying or switching the properties in run-time. Also, you can through this pattern separate the abstractization and the implementation independently. This two should be decoupled because the implementation can be changed in run-time and the abstractization also. 
 
 **Solved Problem :** Decouple the abstractization and the implementation. So, ensure the modification in run-time.
 
 Here for the Bridge pattern I have some classes. The **Color** classes are just for properties for the buildings and exactly I have created the application in this way : Schools are always of White color and the Hotels are Blue. Between this color classes I have an interface which has one method **applyColor**. 
 In this cas I have used the Bridge pattern in composition with Flyweight pattern, where  with the Bridge pattern I have created the buildings(implements **Contruction** class) and the **Flyweight** has the information about buildings. 
 
 ![](https://github.com/gzaharia/TIMPS/blob/master/lab2_tmps/Screens/bridge.PNG) 
 
 ### Decorator 
 
 The Decorator pattern attach additional functionalities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality. For better understanding this pattern I have used an image. In this image we can see how the clas Shape has the applyColor() method and interact with Color(), not every Shape. 
 
 **Solved Problem :** Allow to change the behavior of an object in run-time.
 
 ![](https://github.com/gzaharia/TIMPS/blob/master/lab2_tmps/Screens/decorator_image.png) 
 
 In my case I have the **Interface**, where I defined the methods that the classes(objects) should implement. 
 
 ![](https://github.com/gzaharia/TIMPS/blob/master/lab2_tmps/Screens/decorator_interface.PNG) 
 
 Creating of any type of bulding , I have 2 types of buildings: School and Hotel. I have **Hotel or School** class which extends the **Building** class. 
 
 ![](https://github.com/gzaharia/TIMPS/blob/master/lab2_tmps/Screens/decorator_class.PNG) 
 
 The next is the proper implementation of Decorator pattern, which has the main methods of working with construcions. The Decorator pattern is implemented in the **ConstructionDecorator** class. 
 
 ![](https://github.com/gzaharia/TIMPS/blob/master/lab2_tmps/Screens/decorator.PNG) 
 
 So, the last I have the Class which add the some properties to the existing object, to the **School** exiting building. 
 
 ![](https://github.com/gzaharia/TIMPS/blob/master/lab2_tmps/Screens/apply_decorator.PNG)
 
 
 ### Composite 
 
 The Composite pattern compose objects into tree structures to represent whole-part hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly. This pattern is based on composition relation between objects. 
 
 **Solved Problem :** Manipulation of hierarchical collection of objects. 
 
 I have the **City** class where is the list of all constructions and the methods of creating the composed objects(constructions). 
 
 ![](https://github.com/gzaharia/TIMPS/blob/master/lab2_tmps/Screens/composite.PNG) 
 
 ### Flyweight 
 
 The Flyweight pattern use sharing for supporting the large numbers of fine-grained objects efficietly.Also, change the behavior of the object, from heavy-weight to light-weight.So, we need to use this pattern when the resources cost is high, because the amount of objects is high or then the application does not depend on the object identity.
 
 So, the flyweight object is not the same as the normal object, beacuse here appeares to types of data : **intrinsic** and **extrinsic**. The instrinsic state means : the static object with private methods, extrinsic means : the operation or actions that someone can perform on the intrinsic flyweight object. 
 
 Here I have an HasMap, which verify if the building is created and if this type of building exist this will return the building. Also, if the requested type of building does not exist this will be created and return.
 
 
 **Solved Problem :** Designing the objects for using how much is possible the low amount of resources. 
 
 ![](https://github.com/gzaharia/TIMPS/blob/master/lab2_tmps/Screens/flyweght_image.PNG)
 
![](https://github.com/gzaharia/TIMPS/blob/master/lab2_tmps/Screens/flyweight.PNG)

### Main

![](https://github.com/gzaharia/TIMPS/blob/master/lab2_tmps/Screens/main.PNG)

### Interaction of patterns:

Bridge-------Flyweight

Composite-----Adapter 

Decorator-----all(decorates the all created objects(constructions))


### Output:

![](https://github.com/gzaharia/TIMPS/blob/master/lab2_tmps/Screens/output.PNG) 

### Observations:
- The Proxy and the Bridge pattern can work in application without interactior with some other patterns according to **Ganf of Four** book.
![](https://github.com/gzaharia/TIMPS/blob/master/lab2_tmps/Screens/Interactions.PNG)


### Conclusion:
In this laboratory work I obtained skills operating with Structural design patterns. The skills from this laboratory work are added to the previous experience of working with Creatioal design patterns and the image about how the application should be structured is better. So, the Structural patterns simplify the structure of the application by creating the relations between objects. In other words, it means that how the objects are related to each other through inheritance  and how one class is composed from another. Also, using of design patterns the efficiency of the application increases.
