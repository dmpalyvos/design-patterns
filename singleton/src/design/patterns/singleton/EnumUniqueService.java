package design.patterns.singleton;

/**
 * Singleton using an enumeration instead of a class as described in
 * "Effective Java". If you are going to serialize your instances, this approach
 * is preferred.
 *
 */
public enum EnumUniqueService {
	INSTANCE;

	private int value = 0;

	public void printValue() {
		System.out.println("[*] value = " + this.value);
	}

	public void increaseValue() {
		System.out.println("[*] Increasing value by 1");
		this.value += 1;
	}

}
