package design.patterns.abstractfactory.test;

import design.patterns.abstractfactory.*;
import design.patterns.abstractfactory.domain.DatabaseConnection;
import design.patterns.abstractfactory.domain.DatabaseQuery;

public class Run {

	public static void main(String[] args) {
		System.out.println("[-] Testing MySQL...");
		DatabaseFactory mySQLFactory = new MySQLFactory();
		runDatabaseActions(mySQLFactory);
		System.out.println("[-] Testing PostgreSQL...");
		DatabaseFactory postgreSQLFactory = new PostgreSQLFactory();
		runDatabaseActions(postgreSQLFactory);

	}

	/**
	 * Demonstrate the behavior of our imaginary application which uses a
	 * database. Just by changing the factory, we can immediately have our
	 * system work with a different database implementation, provided that we
	 * get all objects related to database actions from the factory and not
	 * using the new operator.
	 * 
	 * @param dbFactory
	 *            The DatabaseFactory implementation to be used by the
	 *            application.
	 */
	public static void runDatabaseActions(DatabaseFactory dbFactory) {
		DatabaseConnection connection = dbFactory.createConnection();
		DatabaseQuery query = dbFactory.createQuery();
		connection.connect();
		query.execute();
	}

}
