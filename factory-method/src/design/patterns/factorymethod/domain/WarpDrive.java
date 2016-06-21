package design.patterns.factorymethod.domain;

public class WarpDrive implements Engine {

	@Override
	public void start() {
		System.out.println("[*] Started warp drive.");
	}

}
