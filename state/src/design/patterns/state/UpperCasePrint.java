package design.patterns.state;

public enum UpperCasePrint implements PrinterState {
	INSTANCE;

	@Override
	public void print(String message, Printer printer) {
		System.out.println(message.toUpperCase());
		printer.updateState(LowerCasePrint.INSTANCE);
	}
}
