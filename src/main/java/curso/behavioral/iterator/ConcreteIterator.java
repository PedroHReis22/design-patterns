package curso.behavioral.iterator;

import java.util.Map;

public class ConcreteIterator implements Iterator<String> {

	private Map<Integer, String> items;
	private int index;

	public ConcreteIterator(Map<Integer, String> itens) {
		this.items = itens;
		index = 0;
	}

	@Override
	public String first() {
		return items.get(0);
	}

	@Override
	public String next() {
		return items.get(index++);
	}

	@Override
	public boolean isDone() {
		return index >= items.size();
	}

	@Override
	public String currentItem() {
		return items.get(index);
	}

}