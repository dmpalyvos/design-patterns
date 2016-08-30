package design.patterns.decorator;

import design.patterns.decorator.domain.Coffee;

/**
 * Coffee with added sugar.
 */
public class WithSugar extends CoffeeDecorator {

	/**
	 * Decorate a coffee beverage by adding sugar to it.
	 * 
	 * @param coffee
	 *            The object to be decorated.
	 */
	public WithSugar(Coffee coffee) {
		super(coffee);
	}

	@Override
	public String name() {
		return super.name() + ", sugar";
	}

	@Override
	public double cost() {
		return super.cost() + 0.35;
	}

}
