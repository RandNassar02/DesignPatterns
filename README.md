### Design Patterns

#### **Creational Patterns**

1. **Builder Pattern:**
   - To build complex objects step by step.
   - Use When you need to create an object with many configurations or parts.

2. **Factory Pattern:**
   - **Method:**
     - **Simple Factory (Factory Method):** Provides an interface for creating objects, but lets subclasses decide which class to instantiate.
     - **Abstract Factory:** Creates families of related objects without specifying their concrete classes.
   - **When to Use:** When you need to create objects without specifying the exact class of the object that will be created.
 
3. **Prototype Pattern:**
   - To create new objects by copying an existing object.
   - Use  When object creation is costly or complex.

#### **Structural Patterns**

1. **Adapter Pattern:**
   - To convert the interface of a class into another interface that clients expect.
   - Use When you need to integrate classes with incompatible interfaces.

2. **Decorator Pattern:**
   - To add additional responsibilities to objects dynamically.
   - Use When you need to add functionality to objects without altering their structure.

3. **Facade Pattern:**
   - To provide a simplified interface to a complex subsystem.
   - Use When a system is complex and you want to hide its complexities.

4. **Proxy Pattern:**
   - To provide a surrogate or placeholder for another object to control access to it.
   - Use When you need a more flexible or sophisticated reference to an object.

#### **Behavioral Patterns**

1. **Observer Pattern:**
   - To define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified.
   - Use When multiple objects need to be updated automatically when a particular object changes.

2. **Strategy Pattern:**
   - To define a family of algorithms, encapsulate each one, and make them interchangeable.
   - Use When you need to choose an algorithm at runtime from a family of algorithms.

3. **Chain of Responsibility Pattern:**
   - To pass a request along a chain of handlers, allowing multiple objects to handle the request.
   - Use When you have multiple objects that could handle a request, but the exact handler is not known beforehand.

4. **Command Pattern:**
   - To encapsulate a request as an object, allowing parameterization of clients with queues, requests, and operations.
   - Use When you need to decouple the sender and receiver of a request, allowing for more flexible request handling.
