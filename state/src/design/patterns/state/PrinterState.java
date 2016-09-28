package design.patterns.state;

/**
 * State interface. Controls how the text is printed.
 */
public interface PrinterState {
	void print(String message, Printer printer);
}
