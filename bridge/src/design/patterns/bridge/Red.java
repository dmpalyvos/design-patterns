package design.patterns.bridge;

public class Red implements Color {

	@Override
	public void draw() {
		System.out.println("[*] Drawing RED");
	}

}
