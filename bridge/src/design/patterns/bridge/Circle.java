package design.patterns.bridge;

public class Circle extends Shape {

	public Circle(final Color color) {
		super(color);
	}

	@Override
	protected void drawLines() {
		System.out.println("[*] Drawing a CIRCLE");
	}
}
