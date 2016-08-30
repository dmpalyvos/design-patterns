package design.patterns.decorator;

import design.patterns.decorator.domain.Coffee;

/**
 * Coffee with a discount.
 */
public class WithDiscount extends CoffeeDecorator {

	private final double discountAmount;

	/**
	 * Coffee decorated with a discount
	 * 
	 * @param coffee
	 *            The object to be decorated.
	 * @param discountAmount
	 *            The amount to remove from the price.
	 */
	public WithDiscount(Coffee coffee, double discountAmount) {
		super(coffee);
		this.discountAmount = discountAmount;
	}

	@Override
	public String name() {
		return super.name() + ", discount $" + discountAmount;
	}

	@Override
	public double cost() {
		return super.cost() - discountAmount;
	}

}
