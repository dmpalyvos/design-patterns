package design.patterns.visitor;

public class Car extends Vehicle {
	public Car(String name) {
		super(name);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitCar(this);
	}
}
