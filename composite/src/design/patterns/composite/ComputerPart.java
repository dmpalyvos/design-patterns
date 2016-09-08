package design.patterns.composite;

/**
 * A single part.
 */
public class ComputerPart extends Component {

	private final double price;

	public ComputerPart(final String name, double price) {
		super(name);
		this.price = price;
	}

	@Override
	public double price() {
		return this.price;
	}

}
