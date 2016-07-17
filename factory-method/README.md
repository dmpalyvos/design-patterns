# Factory Method

> Define an interface for creating an object, but let subclasses decide which class to instantiate. 
> The Factory method lets a class defer instantiation it uses to subclasses.
> - Gang Of Four

In this example, the method `createEngine()` of the Spaceship class is a factory method. Each subclass overrides it and chooses the appropriate engine to instantiate. The `launch()` template method is used to show how the factory method works.

[More](https://en.wikipedia.org/wiki/Factory_method_pattern)
