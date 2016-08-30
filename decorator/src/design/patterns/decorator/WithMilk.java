package design.patterns.decorator;

import design.patterns.decorator.domain.Coffee;

/**
 * Coffee with added milk.
 */
public class WithMilk extends CoffeeDecorator {

	/**
	 * Decorate a coffee object by adding milk to it.
	 * 
	 * @param coffee
	 *            The object to be decorated.
	 */
	public WithMilk(Coffee coffee) {
		super(coffee);
	}

	@Override
	public String name() {
		return super.name() + ", milk";
	}

	@Override
	public double cost() {
		return super.cost() + 0.5;
	}

}
