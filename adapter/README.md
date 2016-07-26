# Adapter
> The adapter pattern is often used to make existing classes work with others without modifying their source code.

In this example, we have an existing `LegacyPrinter` interface but our systems need to use the newer `Printer` interface. To make it work, we create a `PrinterAdapter` class that has the task of "translating" between the two interfaces.

[More](https://en.wikipedia.org/wiki/Adapter_pattern)