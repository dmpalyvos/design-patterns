package design.patterns.bridge;

public class Rectangle extends Shape {

	public Rectangle(final Color color) {
		super(color);
	}

	@Override
	protected void drawLines() {
		System.out.println("[*] Drawing a RECTANGLE");
	}

}
