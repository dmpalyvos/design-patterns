package design.patterns.factorymethod.test;

import design.patterns.factorymethod.*;

public class Run {

	public static void main(String[] args) {

		// To begin with, launch a slow spaceship which is responsible for
		// creating its (slow) rocket engine using the createEngine() factory
		// method.
		Spaceship slowSpaceship = new SlowSpaceship();
		slowSpaceship.launch();
		System.out.println("--------");
		// Secondly, launch a fast spaceship which is responsible for
		// creating its much faster warp drive using the factory method.
		Spaceship fastSpaceship = new FastSpaceship();
		fastSpaceship.launch();

	}

}
