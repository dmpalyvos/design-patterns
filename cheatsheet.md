# Common Causes For Redesign

1. **Creating an object by specifying a class explicitly:**  Abstract Factory (87), Factory Method (107), Prototype (117)
2. **Dependence on specific operations**: Chain of Responsibility (223), Command (233).
3. **Dependence on hardware and software platform**: Abstract Factory (87), Bridge (151)
4. **Dependence on object representations or implementations**: Abstract Factory (87), Bridge (151), Memento (283), Proxy (207)
5. **Algorithmic dependencies**:  Builder (97), Iterator (257), Strategy (315), Template Method (325), Visitor (331)
6. **Tight coupling**:  Abstract Factory (87), Bridge (151), Chain of Responsibility (223), Command (233),
Facade (185), Mediator (273), Observer (293)
7. **Extending functionality by subclassing**: Bridge (151), Chain of Responsibility (223), Composite (163), Decorator (175), Observer (293), Strategy (315)
8. **Inability to alter classes conveniently**:  Adapter (139), Decorator (175), Visitor (331)

# Variable in the design
See GoF 38

# **Creational Patterns**

## Abstract Factory
> Provide an interface for creating families of related or dependent objects without specifying their
concrete classes.

```java
public interface Button {
    void click();
}

// LinuxButton, OsxButton implement it

public interface Window {
    void show();
}

// LinuxWindow, OsxWindow implement it

public interface AbstractFactory {
    Button createButton();
    Window createWindow();
}

public class LinuxFactory implements AbstractFactory {
    @Override
    Button createButton() {
        return new LinuxButton();
    }
    @Override
    Window createWindow() {
        return new LinuxWindow();
    }
}

//Similarly for OsxFactory
```

## Builder

> Separate the construction of a complex object from its representation so that the same construction process can create different representations.

**The telescoping constructor anti-pattern** occurs when the increase of object constructor parameter combination leads to an exponential list of constructors. Instead of using numerous constructors, the builder pattern uses another object, a builder, that receives each initialization parameter step by step and then returns the resulting constructed object at once.

## Factory Method
> Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.

```java
public abstract class BaseHandler {
    public void handle() {
        newProduct.doAction();
    }

    public abstract Product newProduct();
}

public class ConcreteHandler extends BaseHandler {
    @Override
    public Product newProduct() {
        return new ConcreteProductA();
    }
}
```

## Prototype
> Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype. 

The prototype and the factory are one and the same.

## Singleton
> Ensure a class only has one instance, and provide a global point of access to it.

```java
public class Singleton {
	private static Singleton instance = null;
	private Singleton() {
	}
	public synchronized Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
```
	


## Differences between Creational Patterns

There are 2 ways to parameterize a system by the classes of objects it creates. 

1. Subclass the class that creates the objects (**Factory Method**)
2. Define an object that is responsible for knowing the class of the product objects and make it a parameter of the system (**Abstract Factory**, **Builder** and **Prototype**)
* **Abstract Factory** has the factory object producing objects of several classes
* **Builder** has the factory object create a complex product incrementally using a complex protocol
* **Prototype** is when the factory object and the product are one and the product creates new objects by cloning itself.

# **Structural Patterns**

## Adapter

> Convert the interface of a class into another interface clients expect. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.

```java
public interface Adaptee {
    void specificRequest();
}

public interface Target {
    void request();
}

public class Adapter implements Target {
    private final Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
```

```cpp
class Adaptee {
    public:
        void specificRequest();
}

class Target {
    public:
        virtual void request() = 0;
}

class Adapter : public Target, private Adaptee {
    public:
        virtual void request() override {
            specificRequest();
        }
}
```

## Bridge

> Decouple an abstraction from its implementation so that the two can vary independently.

```java
public interface Database {
    Object[] runQuery(String query);
}

public class MySql implements Database {
    Object[] runQuery(String query) {
        //...
    }
}

public class JsonStore implements Database {
    Object[] runQuery(String query) {
        //...
    }
}

public abstract class Settings {
    private final Database database;

    public Settings(Database database) {
        this.database = database;
    }

    public String get(String key) {
        Object[] results = database.runQuery(key);
        //...
    }
}

/*
 * The abstraction evolves separately from the implementor
 */
public class ApplicationSettigns {
    private final String name;

    public ApplicationSettings(String name, Database database) {
        super(database);
        this.name = name;
    }

    public void save(String key) {
        //...
    }
    
}
```

## Composite

> Compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.

```java
public abstract class Component {
    public void add(Component component) {
        throw new UnsupportedOperationException();
    }
    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    public abstract void operationA();
    
}

public class Item extends Component {
    @Override 
    void operationA() {
        //...
    }
}

public class Composite extends Component {

    private final List<Component> components = new ArrayList<>();

    @Override
    public void add(Component component) {
        //...
    }

    @Override
    public void remove(Component component) {
        //...
    }

    @Override
    public void operationA() {
        for (Component component : components) {
            component.operationA();
        }
    }
}
```

## Decorator

> Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

```java
public interface Component {
    void operationA();
}

/**
 * Base decorator class just delegates to the encapsulated component
 */
public abstract class Decorator implements Component {
    private final Component component;

    public Decorator(final Component component) {
        this.component = component;
    }

    @Override 
    public void operationA() {
        component.operationA();
    }
}


public class RepeatingDecorator extends Decorator {
    public RepeatingDecorator(final Component component) {
        super(component);
    }

    @Override
    public void operationA() {
        for (int i = 0; i < 100; i++) {
            super.operationA();
        }
    }
}

public class LoggingDecorator extends Decorator {
    public RepeatingDecorator(final Component component) {
        super(component);
    }

    @Override
    public void operationA() {
        System.out.println("OperationA START");
        super.operationA()
        System.out.println("OperationA END");
    }
}

```

## Facade

> Provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.

## Flyweight
> Use sharing to support large numbers of fine-grained objects efficiently.

Usually along with maps to check for its existence.

## Proxy
> Provide a surrogate or placeholder for another object to control access to it.

Types:

* Remote Proxy for remote objects
* Virtual Proxy for creating expensive objects on demand
* Protection Proxy to control access
* Smart reference proxy like smart_ptr in C++

## Differences between Structural Patterns

## Adapter/Bridge/Facade
* The key difference lies in the intents of the two patterns.
* The **adapter** focuses on resolving an incombatibility between two **existing** interfaces. It does not focus on how those interfaces are implemented nor does it consider how they might evolve independently.
* **Bridge** on the other hand bridges an **abstraction** and its - possibly numerous - implementations. It provides a **stable interface for clients** and at the same time accomodates new implementations as the system evolves.
* **Bridge** is frequently used during the design phase of a system whereas the **adapter** is used after a system has been designed.
* Finally, although a **Facade** seems like an adapter for a set of objects, it is important to note that it **defines a new interface** while an adapter implements an existing one.

## Composite/Decorator/Proxy
* **Composite** and **decorator** have similar class diagrams as they both rely on recursive composition.
* **Decorator** is used to **add responsibilities to objects without subclassing**, thus avoiding an explosion of subclasses when trying to generate all possible combinations.
* On the other hand, **Composite** focuses on structuring classes so that **many similar objects can be treated uniformly**.
* Similarly to the **Decorator**, a **Proxy** describes how to provide a level of indirection to an objects and it also forwards requests to an encapsulated object. It also provides an interface identical to this object.
* However, the **Proxy** is **not** concerned with attaching or detaching properties dynamically. Its intent is to **provide a stand-in for an object when it's inconvenient or undesirable to access the object directly**.
* In the **Proxy** pattern, the subject defines the key functionality, and the proxy **provides (or refuses) access to it**. In **Decorator**, the component provides **only part of the functionality**, and one or more decorators furnish the rest.

# **Behavioral Patterns**

## Chain of Responsibility

> Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request. Chain the receiving objects and pass the request along the chain until an object handles it.

```java
public abstract class Logger {
    private final Logger next;

    public Logger(Logger next) {
        this.next = next;
    }

    public void log(String message, MessageType type) {
        if (canHandle(type)) {
            //...
        }
        else {
            if (next != null) {
                next.log(message, type);
            }
        }
    }

    public abstract boolean canHandle(MessageType type);
}

// ...
```
## Command

> Encapsulate a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.

1. Command decouples the object that invokes the operation from the one that knows how to perform it.
2. You can assemble commands into a composite command. An example is the MacroCommand class described earlier.
3. Commands are first-class objects. They can be manipulated and extended like any other object.
4. It's easy to add new Commands, because you don't have to change existing classes.

```java
public interface Command {
    void execute();
    void undo();
}

public class Light {
    public void turnOn() {
        //...
    }
    public void turnOff() {
        //...
    }
}

public class TurnOnCommand implements Command {

    private final Light receiver;

    public TurnOnCommand(Light receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        //...
    }

    public void undo() {
        //...
    }
}
```

## Interpreter

> Given a language, define a represention for its grammar along with an interpreter that uses the representation to interpret sentences in the language.

Can be used alogn with a **Visitor** if you want to keep creating new ways of interpreting an expression.

## Iterator
> Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

1. Usually generated by the container by a **Factory Method**. 
2. Can either be **external** or **internal** (which is used in map/filter operations).

## Mediator

> Define an object that encapsulates how a set of objects interact. Mediator promotes loose coupling by keeping objects from referring to each other explicitly, and it lets you vary their interaction independently.


## Memento

> Without violating encapsulation, capture and externalize an object's internal state so that the object can be restored to this state later.

## Observer

> Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

```java
public interface Observer {
    void update(Observable o); // The parameter is optional
} 

public interface Observable { //Also known as Subject
    void add(Observer o);
    void remove(Observer o);
    void notify() {
        //Sample impl
        for (Observer o : observers) {
            o.update(this);
        }
    }
}
```

## State

> Allow an object to alter its behavior when its internal state changes. The object will appear to change its class.

TCP Connection example. All states have the same functions but some functions also change the current state of the context.

Differences from Strategy:

* States store a reference to the context object that contains them. Strategies do not.
* States are allowed to replace themselves (IE: to change the state of the context object to something else), while Strategies are not.
* Strategies are passed to the context object as parameters, while States are created by the context object itself.
* Strategies only handle a single, specific task, while States provide the underlying implementation for everything (or most everything) the context object does.

## Strategy
> Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it.

1. Provides an alternative to subclassing.
2. Eliminates conditional statements


## Template Method

> Define the skeleton of an algorithm in an operation, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.

Holywood principle


```java
public abstract class Algorithm {
    public void compute() {
        doA();
        doB();
        System.out.println("Doing C...");
        doC();
    }

    public void doA() {
        //...
    }

    public abstract void doB();
    public abstract void doC();
}
//...
```

## Visitor

> Represent an operation to be performed on the elements of an object structure. Visitor lets you define a new operation without changing the classes of the elements on which it operates.

```java
public class A {
    void accept(Visitor v) {
        v.visitA(this);
    }
}

public class B {
    void accept(Visitor v) {
        v.visitB(this);
    }
}

// Difificult to add new visitable classes, have to change all Visitor implementations
// But easy to add new operations, just implement a visitor that performs them
public iterface Visitor {
    void visitA(A obj);
    void visitB(B obj);
}

Visitor visitor = new ComplexVisitor();
for (Object o : objects) {
    o.accept(visitor)
}
```

## Encapsulation
* a **Strategy** object encapsulates an algorithm
* a **State** object encapsulates a state-dependent behavior
* a **Mediator** object encapsulates the protocol between objects, and
* an **Iterator** object encapsulates the way you access and traverse the components of an aggregate object

**Chain of Responsibility** illustrates another difference in behavioral patterns: Not all define static
communication relationships between classes. Chain of Responsibility prescribes communication
between an open-ended number of objects.

## Objects as arguments

* A **Visitor** object is the argument to a polymorphic Accept operation on the objects it visits
* Other patterns define objects that act as magic tokens to be passed around and invoked at a later time.
Both **Command** and **Memento** fall into this category 

## Encapsulated vs Distributed Communication
**Mediator** and **Observer** are competing patterns. The difference between them is that Observer
distributes communication by introducing Observer and Subject objects, whereas a Mediator object encapsulates the communication between other objects

In the Observer pattern, there is no single object that encapsulates a constraint. Instead, the Observer and the Subject must cooperate to maintain the constraint. Communication patterns are determined by the way observers and subjects are interconnected: a single subject usually has many observers, and sometimes the observer of one subject is a subject of another observer. The Mediator pattern centralizes rather than distributes. It places the responsibility for maintaining a constraint squarely in the mediator.

## Decoupling Senders and Receivers
When collaborating objects refer to each other directly, they become dependent on each other, and that can have an adverse impact on the layering and reusability of a system. **Command, Observer, Mediator, and Chain of Responsibility** address how you can decouple senders and receivers, but with different tradeoffs.

See GoF - Page 291 for diagrams
