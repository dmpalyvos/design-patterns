package design.patterns.factorymethod.test;

import design.patterns.factorymethod.*;

public class Run {

	public static void main(String[] args) {
		
		//We launch a slow spaceship which is responsible for creating 
		//its (slow) rocket engine using the factory method.
		Spaceship slowSpaceship = new SlowSpaceship();
		slowSpaceship.launch();
		System.out.println("----");
		//Afterwards we launch a fast spaceship which is responsible for creating 
		//its much faster warp drive using the factory method.
		Spaceship fastSpaceship = new FastSpaceship();
		fastSpaceship.launch();
		
	}

}
