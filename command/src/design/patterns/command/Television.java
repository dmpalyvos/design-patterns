package design.patterns.command;

/**
 * The receiver class
 */
public class Television {
	public void turnOn() {
		System.out.println("[*] TV turned ON");
	}

	public void turnOff() {
		System.out.println("[*] TV turned OFF");
	}

	public void volumeUp() {
		System.out.println("[*] TV volume UP");
	}

	public void volumeDown() {
		System.out.println("[*] TV volume DOWN");
	}
}
