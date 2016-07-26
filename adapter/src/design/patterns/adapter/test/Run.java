package design.patterns.adapter.test;

import design.patterns.adapter.PrinterAdapter;
import design.patterns.adapter.domain.*;

public class Run {

	public static void main(String[] args) {
		Printer realPrinter = new PrinterImpl();
		Printer adaptedPrinter = new PrinterAdapter(new LegacyPrinterImpl());
		
		System.out.println("[-] Using real printer");
		realPrinter.loadPaper();
		realPrinter.print();
		
		System.out.println("[-] Using adapted legacy printer");
		adaptedPrinter.loadPaper();
		adaptedPrinter.print();
	}
}
