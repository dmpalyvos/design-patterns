package design.patterns.strategy.test;

import java.util.Arrays;
import java.util.List;

import design.patterns.strategy.AscendingSortStrategy;
import design.patterns.strategy.NumberPrinter;

public class Run {

	public static void main(String[] args) {
		List<Integer> sequence = Arrays.asList(4, 1, 7, 3, 2);
		NumberPrinter numberPrinter = new NumberPrinter(sequence);
		numberPrinter.printSequence();
		numberPrinter.setSortingStrategy(new AscendingSortStrategy());
		numberPrinter.printSequence();
	}

}
