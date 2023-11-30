## The Builder Pattern
It is a **creational pattern**. It is used to build complex object step by step.
It allows to produce different types and representations of objects using the
same construction process.

This pattern suggest to extract the object construction and creation code out of its own class and move it to separate class named `builders`.

## Components:
- **Builder Class:** The builder class in the Builder Pattern is responsible for creating complex objects step by step. It provides a fluent interface that allows clients to easily add components to the object being built. The builder class also enforces the constraints of the object being built, ensuring that only valid objects can be created.


- **Director Class:** It defines the order in which we should call the construction steps so that we can reuse specfic configurations of the products we are building. 
    * It is optional.
    * It hides the details of the product construction from the client code 



