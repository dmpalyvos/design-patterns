package design.patterns.abstractfactory;

import design.patterns.abstractfactory.domain.*;

/**
 * Concrete factory to create PostgreSQL implementations of the database objects
 * in our application.
 */
public class PostgreSQLFactory implements DatabaseFactory {

	@Override
	public DatabaseConnection createConnection() {
		return new PostgreSQLConnection();
	}

	@Override
	public DatabaseQuery createQuery() {
		return new PostgreSQLQuery();
	}

}
