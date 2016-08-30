package design.patterns.decorator.domain;

/**
 * The interface which we are going to decorate.
 */
public interface Coffee {
	/**
	 * @return The name of the beverage.
	 */
	public String name();

	/**
	 * @return The cost of the beverage.
	 */
	public double cost();
}
