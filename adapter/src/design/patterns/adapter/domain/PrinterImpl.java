package design.patterns.adapter.domain;

public class PrinterImpl implements Printer {

	@Override
	public void loadPaper() {
		System.out.println("[*] Printer loading paper");
	}

	@Override
	public void print() {
		System.out.println("[*] Printer printing");
	}

}
