package design.patterns.adapter.domain;

public class LegacyPrinterImpl implements LegacyPrinter {

	@Override
	public void initializeToner() {
		System.out.println("[*] Legacy printer initializing toner");
	}

	@Override
	public void loadPage() {
		System.out.println("[*] Legacy printer loading page");
	}

	@Override
	public void printPage() {
		System.out.println("[*] Legacy printer priting page");
	}
}
