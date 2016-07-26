package design.patterns.adapter.domain;

public interface LegacyPrinter {
	public void initializeToner();
	public void loadPage();
	public void printPage();
}
