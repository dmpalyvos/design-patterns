package design.patterns.composite;

import java.util.HashSet;
import java.util.Set;

/**
 * A complex part that is created by combining multiple other parts.
 */
public class CompositePart extends Component {
	private final Set<Component> components = new HashSet<>();

	public CompositePart(String name) {
		super(name);
	}

	public void addChild(final Component component) {
		components.add(component);
	}

	public void removeChild(final Component component) {
		components.remove(component);
	}

	@Override
	public double price() {
		// In this example, the parts cost $0, but this behavior can easily be
		// changed
		double sum = 0.0;
		for (Component component : components) {
			sum += component.price();
		}
		return sum;
	}

}
