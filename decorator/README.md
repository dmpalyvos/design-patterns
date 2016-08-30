# Decorator 
> Adds behavior to an object without affecting other objects of the same class 

In this example, we decorate the `Coffee` interface using `CoffeeDecorator`. This class simply forwards all requests to an encapsulated Coffee object. All decorators extend `CoffeeDecorator`, override the interface functions to add extra functionality and call the superclass methods when they need something from the encapsulated object.

[More](https://en.wikipedia.org/wiki/Decorator_pattern)