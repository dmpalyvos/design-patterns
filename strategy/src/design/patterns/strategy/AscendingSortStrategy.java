package design.patterns.strategy;

import java.util.Collections;
import java.util.List;

/**
 * A strategy that sorts the numbers by ascending order.
 */
public class AscendingSortStrategy implements SortingStrategy {

	@Override
	public void sortSequence(List<Integer> sequence) {
		Collections.sort(sequence);
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}

}
