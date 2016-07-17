# Abstract Factory

>  Create families of related objects without having to depend on their concrete classes.

In this example, we use factories to create objects to be used with a specific database implementation without having to depend on the specific implementation. By using DatabaseFactory to create all database related objects, we can easily swap from MySQL to PostgreSQL by changing only one line in our code. Namely,
```java 
DatabaseFactory dbFactory = new MySQLFactory();
```
has to be changed to 
```java
DatabaseFactory dbFactory = new MySQLFactory();
```

[More](https://en.wikipedia.org/wiki/Abstract_factory_pattern)