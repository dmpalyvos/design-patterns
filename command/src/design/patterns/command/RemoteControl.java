package design.patterns.command;

/**
 * The invoker class
 */
public class RemoteControl {
	private Command command;
	private boolean undoAvailable = false;

	public void programButton(Command command) {
		this.command = command;
	}

	public void pushMainButton() {
		if (command == null) {
			throw new IllegalStateException("Main button is not initialized.");
		}
		command.execute();
		undoAvailable = true;
	}

	public void pushUndoButton() {
		if (undoAvailable) {
			command.undo();
			undoAvailable = false;
		} else {
			throw new IllegalStateException("Already undid last command.");
		}
	}

}
