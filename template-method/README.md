# Template Method

> Defines the program skeleton of an algorithm in an operation, deferring some steps to subclasses. 

In this example, the method `pay()` of the abstract class `PaymentMethod` is a template method which defines the process that happens during a payment. Some steps of the process are abstract functions and as a result, subclasses are required to define them, changing the overall behavior of the method. 

[More](https://en.wikipedia.org/wiki/Template_method_pattern)