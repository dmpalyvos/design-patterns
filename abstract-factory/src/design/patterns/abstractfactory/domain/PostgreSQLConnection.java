package design.patterns.abstractfactory.domain;

public class PostgreSQLConnection implements DatabaseConnection {

	@Override
	public void connect() {
		System.out.println("[*] Opening PostgreSQL connection...");

	}

}
