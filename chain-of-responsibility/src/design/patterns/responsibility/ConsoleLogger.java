package design.patterns.responsibility;

import java.util.Set;

public class ConsoleLogger extends Logger {
	public ConsoleLogger(Set<LogLevel> logLevels) {
		super(logLevels);
	}

	@Override
	protected void logMessage(String message) {
		System.out.println("[*] Logging to CONSOLE: " + message);
	}

}
