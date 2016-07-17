package design.patterns.factorymethod.domain;

/**
 * A slow spaceship engine for slow spaceships.
 */
public class Rocket implements Engine {

	@Override
	public void start() {
		System.out.println("[*] Started rocket engine.");
	}

}
