package design.patterns.command;

/**
 * The command interface. Invokers only need to have knowledge of this without
 * knowing anything about the receiver of the request.
 * 
 */
public interface Command {
	void execute();

	void undo();
}