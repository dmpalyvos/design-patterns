package design.patterns.bridge;

/**
 * The implementor interface. We want this to be able to evolve separately from
 * the abstraction interface.
 */
public interface Color {
	void draw();
}