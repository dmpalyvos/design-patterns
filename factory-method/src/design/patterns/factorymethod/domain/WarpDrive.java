package design.patterns.factorymethod.domain;

/**
 * A fast spaceship engine for fast spaceships.
 */
public class WarpDrive implements Engine {

	@Override
	public void start() {
		System.out.println("[*] Started warp drive.");
	}

}
