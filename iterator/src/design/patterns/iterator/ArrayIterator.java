package design.patterns.iterator;

import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T> {
	private final T[] array;
	private int pos = 0;

	public ArrayIterator(T[] array) {
		this.array = array;
	}

	@Override
	public boolean hasNext() {
		return pos < array.length;
	}

	@Override
	public T next() {
		return array[pos++];
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
