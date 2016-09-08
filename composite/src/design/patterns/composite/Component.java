package design.patterns.composite;

/**
 * The common ancestor of both plain objects and composites. All available
 * operations are defined here, so that we can have uniform handling of the
 * objects. However, if the client tries to do something invalid, such as
 * calling addChild() on a non-composite, an exception will be thrown at
 * runtime.
 */
public abstract class Component {

	private final String name;

	public Component(final String name) {
		this.name = name;
	}

	public void addChild(final Component component) {
		throw new UnsupportedOperationException();
	}

	public void removeChild(final Component component) {
		throw new UnsupportedOperationException();
	}

	public final String name() {
		return this.name;
	}

	public abstract double price();
}
