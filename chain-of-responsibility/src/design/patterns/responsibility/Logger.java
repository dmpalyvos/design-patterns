package design.patterns.responsibility;

import java.util.Set;

/**
 * The base abstract class that provides all the functionality for the chain. It
 * allows to set a successor that will handle the request if the current object
 * can not and provides the template method {@link #log()} that performs that
 * check.
 * 
 */
public abstract class Logger {

	private final Set<LogLevel> logLevels;

	private Logger successor = null;

	/**
	 * Constructor that initializes the set of the accepted LogLevels for this
	 * object.
	 */
	public Logger(Set<LogLevel> logLevels) {
		this.logLevels = logLevels;
	}

	/**
	 * Set the Logger that will handle the request if this object fails to do
	 * so.
	 */
	public void setSuccessor(final Logger successor) {
		this.successor = successor;
	}

	/**
	 * Template method. Log the message. When calling this function we do not
	 * know who will actually log the message. We just throw it inside the chain
	 * of Responsibility and hope for the best.
	 */
	public void log(String message, LogLevel level) {
		if (logLevels.contains(level)) {
			logMessage(message);
		} else {
			// The request might fall of the end of the chain without ever being
			// handled
			if (successor != null) {
				successor.log(message, level);
			}
		}
	}

	protected abstract void logMessage(String message);

}