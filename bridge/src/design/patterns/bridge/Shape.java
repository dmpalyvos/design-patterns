package design.patterns.bridge;

/**
 * The abstraction. Creates a bridge with the Color implementor and uses
 * composition rather than inheritance to utilize its methods
 */
public abstract class Shape {

	private final Color color;

	public Shape(final Color color) {
		this.color = color;
	}

	/**
	 * Template method. The drawLines() behavior of each shape is defined by its
	 * implementation and the color is drawn using the encapsulated Color's
	 * draw() method.
	 */
	public void draw() {
		drawLines();
		color.draw();
	}

	/**
	 * The method that differentiates each shape implementation.
	 */
	protected abstract void drawLines();
}
