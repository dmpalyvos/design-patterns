package design.patterns.singleton.test;

import design.patterns.singleton.EnumUniqueService;
import design.patterns.singleton.UniqueService;

public class Run {

	public static void main(String[] args) {
		System.out.println("[-] Using vanila singleton");
		singletonFirstUSe();
		singletonSecondUse();
		System.out.println("[-] Using enum singleton");
		enumSingletonFirstUSe();
		enumSingletonSecondUse();
	}

	private static void singletonFirstUSe() {
		System.out.println("[-] First function");
		UniqueService service = UniqueService.getInstance();
		service.printValue();
		service.increaseValue();
	}

	private static void singletonSecondUse() {
		System.out.println("[-] Second function");
		UniqueService service = UniqueService.getInstance();
		// Prints the updated value
		service.printValue();
	}

	private static void enumSingletonFirstUSe() {
		System.out.println("[-] First function");
		EnumUniqueService service = EnumUniqueService.INSTANCE;
		service.printValue();
		service.increaseValue();
	}

	private static void enumSingletonSecondUse() {
		System.out.println("[-] Second function");
		EnumUniqueService service = EnumUniqueService.INSTANCE;
		// Prints the updated value
		service.printValue();
	}

}
