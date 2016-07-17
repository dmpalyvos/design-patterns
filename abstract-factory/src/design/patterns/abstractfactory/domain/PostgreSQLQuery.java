package design.patterns.abstractfactory.domain;

public class PostgreSQLQuery implements DatabaseQuery {
	
	@Override
	public void execute() {
		System.out.println("[*] Executing PostgreSQL query...");
	}

}
