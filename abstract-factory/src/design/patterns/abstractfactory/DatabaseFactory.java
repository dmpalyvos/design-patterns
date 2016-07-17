package design.patterns.abstractfactory;

import design.patterns.abstractfactory.domain.DatabaseConnection;
import design.patterns.abstractfactory.domain.DatabaseQuery;

/**
 * Abstract factory interface. Responsible for creating a family of objects. In
 * this example, the family of objects is related to database usage. The
 * factories we create use the factory method pattern, letting subclasses decide
 * which type of object they should instantiate.
 */
public interface DatabaseFactory {
	public DatabaseConnection createConnection();

	public DatabaseQuery createQuery();
}
