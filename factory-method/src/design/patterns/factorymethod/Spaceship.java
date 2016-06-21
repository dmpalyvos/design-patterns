package design.patterns.factorymethod;

import design.patterns.factorymethod.domain.Engine;

public abstract class Spaceship {
	
	
	/*
	 * This is a template method from which a factory method is usually called.
	 */
	public void launch() {
		System.out.println("[*] Preparing for launch.");
		System.out.println("[*] Starting engine.");
		Engine engine = createEngine();
		engine.start();
		System.out.println("[*] Launch successful.");
	}

	/*
	 * This is the factory method.
	 * It will create an appropriate object based on the subclass of the ship.
	 */
	public abstract Engine createEngine();

}
