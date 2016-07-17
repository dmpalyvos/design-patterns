package design.patterns.factorymethod;

import design.patterns.factorymethod.domain.Engine;

public abstract class Spaceship {

	/**
	 * Template method used by subclasses to show the factory method in action.
	 * Note that the factory method pattern is frequently used along the
	 * template method pattern.
	 */
	public void launch() {
		System.out.println("[*] Preparing for launch.");
		System.out.println("[*] Starting engine.");
		Engine engine = createEngine();
		engine.start();
		System.out.println("[*] Launch successful.");
	}

	/**
	 * Factory method. Each subclass overrides this method and instantiates the
	 * appropriate object. In this example, the Engine created by the factory
	 * method is for internal use by the object. However, factory methods can
	 * also generate objects to be used by others. For example abstract
	 * factories are usually implemented using factory methods.
	 */
	protected abstract Engine createEngine();

}
