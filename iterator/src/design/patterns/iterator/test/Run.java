package design.patterns.iterator.test;

import design.patterns.iterator.ArrayIterator;

public class Run {

	public static void main(String[] args) {
		Integer[] nums = new Integer[] { 1, 5, 6, 7 };
		ArrayIterator<Integer> it = new ArrayIterator<>(nums);
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		String[] phrases = new String[] { "Hello", "World", "!" };
		ArrayIterator<String> it2 = new ArrayIterator<>(phrases);
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}
	}
}
