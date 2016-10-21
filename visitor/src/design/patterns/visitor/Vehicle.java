package design.patterns.visitor;

public abstract class Vehicle {
	private final String name;

	public Vehicle(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public abstract void accept(Visitor visitor);
}
