package design.patterns.strategy;

import java.util.List;

/**
 * The interface that encapsulates the family of algorithms related to sorting a
 * list of numbers.
 */
public interface SortingStrategy {
	/**
	 * The useful action that the implementations of the algorithm must perform.
	 * 
	 * @param sequence
	 *            The list is to be sorted by the algorithm.
	 */
	void sortSequence(List<Integer> sequence);
}
