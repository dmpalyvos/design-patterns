package design.patterns.composite.test;

import design.patterns.composite.*;

public class Run {

	public static void main(String[] args) {
		Component chassis = new CompositePart("Chassis");
		Component motherboard = new CompositePart("M/B");
		Component cpu = new ComputerPart("CPU", 250);
		Component gpu = new ComputerPart("GPU", 300);
		Component hdd = new ComputerPart("HDD", 100);
		motherboard.addChild(cpu);
		motherboard.addChild(gpu);
		chassis.addChild(motherboard);
		chassis.addChild(hdd);
		System.out.println("Total price = $" + chassis.price());
	}

}
