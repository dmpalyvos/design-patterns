package design.patterns.visitor;

public class SimplePrintingVisitor implements Visitor {
	@Override
	public void visitCar(final Car car) {
		System.out.format("Car [%s]%n", car.getName());
	}

	@Override
	public void visitTruck(final Truck truck) {
		System.out.format("Truck [%s, load: %d Tons]%n", truck.getName(), truck.getLoad());
	}
}
