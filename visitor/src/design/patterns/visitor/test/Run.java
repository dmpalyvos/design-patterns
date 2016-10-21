package design.patterns.visitor.test;

import java.util.Arrays;
import java.util.List;

import design.patterns.visitor.*;

public class Run {

	public static void main(String[] args) {
		List<Vehicle> vehicles = Arrays.asList(new Car("Ford"), new Truck("Mercedes", 200), new Truck("Toyota", 2),
				new Car("Volvo"));
		System.out.println("[-] Simple Printing");
		Visitor simple = new SimplePrintingVisitor();
		for (Vehicle vehicle : vehicles) {
			vehicle.accept(simple);
		}

		System.out.println("[-] Pretty Printing");
		Visitor pretty = new PrettyPrintingVisitor();
		for (Vehicle vehicle : vehicles) {
			vehicle.accept(pretty);
		}
	}

}
