package design.patterns.strategy;

import java.util.List;

/**
 * A strategy that does nothing.
 *
 */
public class NoSortStrategy implements SortingStrategy {

	@Override
	public void sortSequence(List<Integer> sequence) {
		// Do nothing
		return;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}

}
