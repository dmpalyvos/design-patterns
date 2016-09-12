package design.patterns.command;

public class TurnOnCommand implements Command {

	private Television tv;

	public TurnOnCommand(final Television tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.turnOn();
	}

	@Override
	public void undo() {
		tv.turnOff();
	}

}
