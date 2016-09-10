package design.patterns.responsibility;

import java.util.Set;

public class DatabaseLogger extends Logger {
	public DatabaseLogger(Set<LogLevel> logLevels) {
		super(logLevels);
	}

	@Override
	protected void logMessage(String message) {
		System.out.println("[*] Logging to DATABASE: " + message);
	}

}