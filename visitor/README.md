> Represent an operation to be performed on the elements of an object structure. Visitor lets you define a new
operation without changing the classes of the elements on which it operates. Accept is a **double-dispatch** operation. Its meaning depends on two types: the Visitor's and the Element's. Double-dispatching lets visitors request different operations on each class element.

GOF - Design Patterns

In this example, we add different printing functionalities to our Vehicle objects by adding two kinds of visitors.