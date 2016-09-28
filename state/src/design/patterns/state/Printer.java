package design.patterns.state;

/**
 * The context class that interacts with the client. It has an internal state
 * that makes it behave like a Finite State Machine.
 */
public class Printer {
	private PrinterState state = LowerCasePrint.INSTANCE;

	public void print(String message) {
		state.print(message, this);
	}

	public void updateState(PrinterState newState) {
		this.state = newState;
	}
}
