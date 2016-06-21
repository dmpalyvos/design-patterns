package design.patterns.factorymethod.domain;

public class Rocket implements Engine {

	@Override
	public void start() {
		System.out.println("[*] Started rocket engine.");
	}

}
