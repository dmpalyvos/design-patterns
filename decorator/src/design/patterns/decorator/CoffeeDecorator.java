package design.patterns.decorator;

import design.patterns.decorator.domain.Coffee;

/**
 * Base class that all decorators inherit from. It has to:
 * 
 * <ol>
 * <li>Implement the decorated interface.
 * <li>Encapsulate an object of that interface.
 * <li>Forward all requests to the encapsulated object.
 * </ol>
 * 
 *
 */
public class CoffeeDecorator implements Coffee {

	private final Coffee decoratedCoffee;

	public CoffeeDecorator(final Coffee coffee) {
		this.decoratedCoffee = coffee;
	}

	@Override
	public String name() {
		return decoratedCoffee.name();
	}

	@Override
	public double cost() {
		return decoratedCoffee.cost();
	}

}
