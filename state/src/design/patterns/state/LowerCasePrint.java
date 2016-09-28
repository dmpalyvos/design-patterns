package design.patterns.state;

public enum LowerCasePrint implements PrinterState {
	INSTANCE;

	@Override
	public void print(String message, Printer printer) {
		System.out.println(message.toLowerCase());
		printer.updateState(UpperCasePrint.INSTANCE);

	}
}
