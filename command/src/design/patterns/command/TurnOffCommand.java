package design.patterns.command;

public class TurnOffCommand implements Command {

	private Television tv;

	public TurnOffCommand(final Television tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.turnOff();
	}

	@Override
	public void undo() {
		tv.turnOn();
	}

}
