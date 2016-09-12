package design.patterns.command;

public class VolumeUpCommand implements Command {

	private Television tv;

	public VolumeUpCommand(final Television tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.volumeUp();
	}

	@Override
	public void undo() {
		tv.volumeDown();
	}

}
