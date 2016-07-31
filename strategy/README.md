# Strategy 
> The strategy pattern enables an algorithm's behavior to be selected at runtime.

In this example, the clients of `NumberPrinter` want to be able to select the order of numbers at runtime. Instead of having many subclasses of `NumberPrinter`, we encapsulate the sorting behavior using the `SortingStrategy` and use composition to achieve our goal.

[More](https://en.wikipedia.org/wiki/Strategy_pattern)