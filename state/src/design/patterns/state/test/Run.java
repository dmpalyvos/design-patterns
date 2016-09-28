package design.patterns.state.test;

import design.patterns.state.Printer;

public class Run {

	public static void main(String[] args) {
		Printer printer = new Printer();
		printer.print("A sample text");
		printer.print("A sample text");
		printer.print("A sample text");
	}

}
