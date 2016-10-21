package design.patterns.visitor;

public interface Visitor {
	void visitCar(final Car car);

	void visitTruck(final Truck truck);
}
