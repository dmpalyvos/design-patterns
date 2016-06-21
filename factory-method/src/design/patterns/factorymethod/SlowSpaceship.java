package design.patterns.factorymethod;

import design.patterns.factorymethod.domain.Engine;
import design.patterns.factorymethod.domain.Rocket;

public class SlowSpaceship extends Spaceship {
	
	public SlowSpaceship() {
		System.out.println("[*] SlowSpaceship created.");
	}

	@Override
	public Engine createEngine() {
		return new Rocket();
	}

}
