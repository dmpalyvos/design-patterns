package design.patterns.strategy;

import java.util.*;

/**
 * This is the class that uses the strategy pattern. The algorithm that controls
 * the order in which the numbers are printed is set at runtime by calling
 * {@link #setSortingStrategy(SortingStrategy)}. As a result, there is no need
 * to create a subclass of NumberPrinter if you want to have a different
 * printing order. Just set a different SortingStrategy and everything works as
 * expected.
 *
 */
public class NumberPrinter {
	/**
	 * The algorithm that sets the order of the numbers.
	 */
	private SortingStrategy sortingStrategy = new NoSortStrategy();
	private final List<Integer> sequence;

	/**
	 * Default constructor. Sets the sequence that this printer will print.
	 * 
	 * @param sequence
	 *            The List of Integers that we want to print.
	 */
	public NumberPrinter(List<Integer> sequence) {
		this.sequence = sequence;
	}

	/**
	 * Print the given list of integers using the specified strategy.
	 */
	public void printSequence() {
		List<Integer> sequenceToPrint = new ArrayList<>(sequence);
		sortingStrategy.sortSequence(sequenceToPrint);
		System.out.println("[-] Printing sequence using: " + sortingStrategy);
		for (Integer element : sequenceToPrint) {
			System.out.print(element + " ");
		}
		System.out.println();
	}

	/**
	 * Set the algorithm for sorting the numbers.
	 */
	public void setSortingStrategy(SortingStrategy strategy) {
		this.sortingStrategy = strategy;
	}

}
