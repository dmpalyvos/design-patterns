package design.patterns.abstractfactory.domain;

public class MySQLConnection implements DatabaseConnection {

	@Override
	public void connect() {
		System.out.println("[*] Opening MySQL connection...");
	}

}
