package design.patterns.visitor;

public class Truck extends Vehicle {
	private final int load;

	public Truck(String name, int load) {
		super(name);
		this.load = load;
	}

	public int getLoad() {
		return this.load;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitTruck(this);
	}
}