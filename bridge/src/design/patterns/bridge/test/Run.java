package design.patterns.bridge.test;

import design.patterns.bridge.*;

public class Run {

	public static void main(String[] args) {
		Shape redRectangle = new Rectangle(new Red());
		Shape greenCircle = new Circle(new Green());
		redRectangle.draw();
		greenCircle.draw();
	}

}
