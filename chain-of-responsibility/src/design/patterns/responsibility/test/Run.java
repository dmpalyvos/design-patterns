package design.patterns.responsibility.test;

import java.util.EnumSet;

import design.patterns.responsibility.*;

public class Run {

	public static void main(String[] args) {
		// The start of the chain that we will give all our messages to
		Logger baseLogger = new ConsoleLogger(EnumSet.of(LogLevel.DEBUG));
		// Logger for more serious issues, indirectly called by baseLogger
		Logger secondaryLogger = new DatabaseLogger(EnumSet.of(LogLevel.WARNING, LogLevel.ERROR));
		// Logger for fatal errors, indirectly called by secondaryLogger
		// This is the end of the chain
		Logger fallbackLogger = new FileLogger(EnumSet.of(LogLevel.FATAL));
		// Configure the chain
		baseLogger.setSuccessor(secondaryLogger);
		secondaryLogger.setSuccessor(fallbackLogger);
		// The the chain
		baseLogger.log("Loading resources", LogLevel.INFO);
		baseLogger.log("Missing laguages.xml", LogLevel.DEBUG);
		baseLogger.log("Missing styles.css", LogLevel.WARNING);
		baseLogger.log("Could not render page", LogLevel.ERROR);
		baseLogger.log("Unexpected exception occured", LogLevel.FATAL);
	}
}
