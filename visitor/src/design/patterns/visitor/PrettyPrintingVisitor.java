package design.patterns.visitor;

public class PrettyPrintingVisitor implements Visitor {
	@Override
	public void visitCar(final Car car) {
		System.out.format("[*] A car with the name %s%n", car.getName());
	}

	@Override
	public void visitTruck(final Truck truck) {
		System.out.format("[@] A truck with the name %s that is loaded with %d tons%n", truck.getName(),
				truck.getLoad());
	}
}