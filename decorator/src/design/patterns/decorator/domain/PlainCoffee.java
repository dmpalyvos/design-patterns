package design.patterns.decorator.domain;

/**
 * Concrete implementation of the coffee interface.
 */
public class PlainCoffee implements Coffee {

	@Override
	public String name() {
		return "Coffee";
	}

	@Override
	public double cost() {
		return 1.0;
	}

}
