## Structural Patterns

This project is include structural pattern implementations. I got the course; Design Patterns in Java: Structural by Bryan Hansen, which has the link as follows;

https://app.pluralsight.com/library/courses/design-patterns-java-structural

I tried to modify the examples in the implementations. 

### Adapter Pattern

Commonly, the adapter pattern is used for dealing wit legacy codes. It is noteced that the functionality of the program should not be changed in the adapter implementation. 

### Bridge Pattern

The Bridge pattern is used to decouple abstraction and implementation. When the system has orthogonal dimensions and we want to separate these to avoid the combinational crashes of the classes., the bridge pattern is suitable for this scenario.

Some drawbacks of this pattern are can increase the complexity and it is hard to design it conceptually. 

### Composite Pattern

It deals with the tree structure and intends that a leaf and composite to have the same interface. It is structured so that the components either the leaf or the individual object are the same. They are designed to have the same operators and functions.

### Decorator Pattern

The decorator pattern is used for adding the functionality of each level of the hierarchy without breaking down the other part of the system. IT addicts to the single responsibility principle in the OOP. 

The behavior of the parts of the system can be composed to decorate the classes. It provides a unique way to adding functionality. 

### Facade Pattern

Generally used to simplify poorly designed API and reduce the code's dependencies from outside. It provides an easy-to-use interface to the client. It is easy to implement also. We just need to wrap the facade around the API. 

### Flyweight Pattern
It has been used for minimizing the usage of memory by sharing similarly typed objects. It is a type of optimization pattern. It employs the Factory pattern to get the instances of the flyweight objects. It has a creational pattern inside the structural pattern.

### Proxy Pattern

The proxy pattern acts as an interface between a class and the others. It can be used for various reasons, such as security checks, simplifying the availability of the object. The object is wrapped by another object and can be added more functionality to the class.  The proxy is used to access the real object.  In the implementation example, the application throws an exception because of the authentication consideration. Any security step can be implemented in the proxy class. 
