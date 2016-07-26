package design.patterns.adapter;

import design.patterns.adapter.domain.LegacyPrinter;
import design.patterns.adapter.domain.Printer;

/**
 * Adapter class that changes the interface of LegacyPrinter to conform to the
 * new interface of Printer. The adapter always implements the interface that it
 * wants to adapt to and contains a reference to the object that is to be
 * adapted.
 */
public class PrinterAdapter implements Printer {

	private final LegacyPrinter legacyPrinter;

	public PrinterAdapter(LegacyPrinter legacyPrinter) {
		this.legacyPrinter = legacyPrinter;
	}

	@Override
	public void loadPaper() {
		System.out.println("[*] Printer adapter loading paper");
		legacyPrinter.initializeToner();
		legacyPrinter.loadPage();
	}

	@Override
	public void print() {
		System.out.println("[*] Printer adapter printing");
		legacyPrinter.printPage();
	}

}
