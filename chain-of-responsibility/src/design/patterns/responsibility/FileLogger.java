package design.patterns.responsibility;

import java.util.Set;

public class FileLogger extends Logger {
	public FileLogger(Set<LogLevel> logLevels) {
		super(logLevels);
	}

	@Override
	protected void logMessage(String message) {
		System.out.println("[*] Logging to FILE: " + message);
	}

}