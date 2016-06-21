package design.patterns.factorymethod;

import design.patterns.factorymethod.domain.Engine;
import design.patterns.factorymethod.domain.WarpDrive;

public class FastSpaceship extends Spaceship {
	
	public FastSpaceship() {
		System.out.println("Fast spaceship created.");
	}

	@Override
	public Engine createEngine() {
		return new WarpDrive();
	}

}
