package design.patterns.singleton;

/**
 * Vanilla singleton implementation. Holds a unique instance as a private static
 * variable, has a private constructor and provides a static method for getting
 * the only instance of the class.
 *
 */
public class UniqueService {

	private static UniqueService instance;
	private int value = 0;

	/**
	 * The constructor is private so noone outside the class can instantiate it.
	 */
	private UniqueService() {
		System.out.println("[*] Creating new SingletonService instance");
	}

	/**
	 * Clients use this method to get the only instance of the class.
	 * 
	 * @return The unique instance of the class.
	 */
	public static synchronized UniqueService getInstance() {
		if (instance == null) {
			instance = new UniqueService();
		}
		return instance;
	}

	public void printValue() {
		System.out.println("[*] value = " + this.value);
	}

	public void increaseValue() {
		System.out.println("[*] Increasing value by 1");
		this.value += 1;
	}

}
