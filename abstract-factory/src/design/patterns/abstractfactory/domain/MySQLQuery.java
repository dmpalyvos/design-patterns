package design.patterns.abstractfactory.domain;

public class MySQLQuery implements DatabaseQuery {
	
	@Override
	public void execute() {
		System.out.println("[*] Executing MySQL query...");
	}

}
