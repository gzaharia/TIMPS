## TIMPS Laboratory Work Nr.3


### Prerequisites:
  - Design patterns
  - Behavioral design patterns
  - Organize and structure the application using behavioral design patterns.

### Objectives:
  - Study behavioral design patterns
  - Develop a project using 5 behavioral design patterns
  - Ensure connection between patterns
 
 ### Tasks: 
 -  Create an application using 5 design behavioral patterns : 
    - Template
    - Strategy
    - Visitor
    - Iterator
    - Chain 
    
 ### Implementation of task: 
 For performing this laboratory work I have read about behavioral design patterns and what is the purpose of using this patterns. Behavioral design patterns are concerned with algorithms and the assignment of responsibilities between objects.Behavioral patterns describe not just patterns of objects or classes but also the patternsof communication between them. 
 
 These patterns characterize complex control flow that's difficult to follow at run-time.They shift yourfocus away from flow of control to let you concentrate just on
the wayobjects are interconnected.

So, next let's analyze the implementation of the specified patterns.

### Template Pattern

Template method defines the steps to execute an algorithm and it can provide default implementation that might be common for all or some of the subclasses.The important point is that the we can’t change the order of execution because we can’t build windows before building the foundation. So in this case we can create a template method that will use different methods to build the house.

- You can let clients override only certain parts of a large algorithm, making them less affected by changes that happen to other parts of the algorithm. 
-  You can pull the duplicate code into a superclass.

In this pattern can be violated the **Liskov Substitute Principle**, because the implemention is done from the subclass.

**Solved problem :** Avoid the duplication of the same in different subclasses, able to dynamically add some objects.


In my case I have performed the Template method for having an skeleton for building the houses. I have in this class the **final** method which can not be override from subclasses and also contains the methods that will be executed in the specific order. The order means you can't build a house starting from windows or walls.

![]() 

![]()

![]()

### Strategy Pattern

Strategy is a behavioral design pattern that lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable. The Strategy pattern suggests that you take a class that does something specific in a lot of different ways and extract all of these algorithms into separate classes called strategies.

So , we have the main class which we can call that is **context** and that context will have the reference to the strategies which client will call for creating the objects. The context is not resposible for choosing the algorithm this does not know much about strategies, this just trigger the encapsulated strategy.

Related to my case , I have the strategies for creating some types of buildings. Buildings have no idea how they will be created, I just called the strategy for building(encapsulate the methods), I kept only reference to the strategies. The **Strategy Pattern** also follow the order of calling the methods from **BuildingContructionTemplateStrategy**.

**Solved Problem :** Many related classes differ only in their behavior. Strategy provide a class with one of many behaviors.

![]()

![]()

![]()

![]()

![]()

![]()

### Visitor

Visitor is a behavioral design pattern that lets you separate algorithms from the objects on which they operate. We can say that this pattern is the same as Strategy/Template method Patterns, using another explanation we can say that the Visitor is a sub-part of the strategy pattern. The strategy pattern is more like 1:many relation, but Visitor is many:many.

- Open/Closed Principle.
- Single Responsability Principle.

In my code the implementation of visitor pattern is the same as the **Template Method Pattern** , because I use the sam methods for all objects , for those that exist and for those that will be created. One question can be : **Why you don't use polymorphism** , here I can't use overloading , because I will use not only one method and different parameters , but all methods. The new object that will be created will knows what strategy and methods to apply for creating the object. Also, we can say that the visitor pattern used the **Double Dispatch**

**Solved Problem:** The Visitor pattern suggests that you place the new behavior into a separate class called visitor, instead of trying to integrate it into existing classes.

![]()

![]()

![]()

### Iterator

Iterator is a behavioral design pattern that lets you traverse elements of a collection without exposing its underlying representation (list, stack, tree, etc.).

- Iterator pattern is useful when you want to provide a standard way to iterate over a collection and hide the implementation logic from client program.
- The logic for iteration is embedded in the collection itself and it helps client program to iterate over them easily.

Let's analyze the problem that solved the Iterator Pattern. The collections can be of several structure, but no matter what type of structure is used , the main approach is to achieve the all elements from collection. So , the Iterator Pattern finds the solution and propose to :

**Solved Problem:** Extract the traversal behavior of collection into a separte object.

I have 2 interfaces : **ConstructionsCollection** and **ConstructionIterator**. and one class **ConstructionCollectionImpl**.

- **ConstructionsCollection -** contains available methods for creating the constructions.
- **ConstructionIterator -** contains one boolean method **hasNext()**, which verify if the list has the next element and the **next()** method, which display the all objects of the same type.

![]()

![]()

![]()

![]()


### Chain of Resposability

Chain of Responsibility is a behavioral design pattern that lets you pass requests along a chain of handlers. Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.

Like many other behavioral design patterns, the Chain of Responsibility relies on transforming particular behaviors into stand-alone objects called handlers. In our case, each check should be extracted to its own class with a single method that performs the check. The request, along with its data, is passed to this method as an argument.

- You can control the order of requests.
- Single Responsability Principle, promote the loose coupling.
- Open/Closed Principle, you can introduce new handlers.

**Solved Problem:** Contains an chain of handlers which decide who of them will handler the request.

In my case I had to perform some actions for Constructions. So, I have an order of executing the actions on the object: **BuildChain**, **DecorateChain**,**SellChain** and one interface that keep the 2 methods for setting the next chain and for performing the aactions,
**setNextChain()**, **performAction()**.

![]()

![]()

![]()

![]()

![]()

![]()




