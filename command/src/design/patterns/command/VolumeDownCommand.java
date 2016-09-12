package design.patterns.command;

public class VolumeDownCommand implements Command {

	private Television tv;

	public VolumeDownCommand(final Television tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.volumeDown();
	}

	@Override
	public void undo() {
		tv.volumeUp();
	}

}
