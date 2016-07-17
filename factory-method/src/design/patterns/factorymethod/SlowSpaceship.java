package design.patterns.factorymethod;

import design.patterns.factorymethod.domain.Engine;
import design.patterns.factorymethod.domain.Rocket;

public class SlowSpaceship extends Spaceship {

	public SlowSpaceship() {
		System.out.println("[*] Slow Spaceship created.");
	}

	/**
	 * The slow spaceship's factory method creates a rocket engine which is
	 * pretty slow.
	 */
	@Override
	protected Engine createEngine() {
		return new Rocket();
	}

}
