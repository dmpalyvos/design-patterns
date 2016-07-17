package design.patterns.abstractfactory;

import design.patterns.abstractfactory.domain.*;

/**
 * Concrete factory to create MySQL implementations of the database objects in
 * our application.
 */
public class MySQLFactory implements DatabaseFactory {

	@Override
	public DatabaseConnection createConnection() {
		return new MySQLConnection();
	}

	@Override
	public DatabaseQuery createQuery() {
		return new MySQLQuery();
	}

}
