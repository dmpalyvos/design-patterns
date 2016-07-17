package design.patterns.factorymethod;

import design.patterns.factorymethod.domain.Engine;
import design.patterns.factorymethod.domain.WarpDrive;

public class FastSpaceship extends Spaceship {

	public FastSpaceship() {
		System.out.println("[*] Fast spaceship created.");
	}

	/**
	 * The fast spaceship's factory method creates a warp drive, which is really
	 * fast for Earth's standards.
	 */
	@Override
	protected Engine createEngine() {
		return new WarpDrive();
	}

}
