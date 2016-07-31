# Singleton
> The singleton pattern restricts the instantiation of a class to a limited number of objects (usually just one). 

In this example, there are two implementations of the pattern. The first, `UniqueService` is the most common, while `EnumUniqueSingleton` is another approach that was introduced in the book "Effective Java" by Joshua Bloch and offers some advantages, especially if you indent to serialize your objects. 

Be aware that the singleton is considered an *anti-pattern* by some and its functionality can be replicated by using a dependency injection framework such as Guice or Spring.

[More](https://en.wikipedia.org/wiki/Singleton_pattern)