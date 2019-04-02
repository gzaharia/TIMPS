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


In my case I have performed the Template method for having an skeleton for building the houses. I have in this class the **final** method which can not be override from subclasses and also contains the methods that will be executed in the specific order. The order means you can't build a house starting from windowsses or walls.

