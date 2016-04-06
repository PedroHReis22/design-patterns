package curso.behavioral.iterator;

import java.util.HashMap;
import java.util.Map;

public class Items implements Aggregate {
	
	private Map<Integer, String> items;
	private int index;
	
	public Items() {
		items = new HashMap<>();
		index = 0;
	}
	
	public void add(String item) {
		items.put(index++, item);
	}
	
	public void remove(String item) {
		items.remove(item);
	}
	
	public int getNumberOfItems() {
		return items.size();
	}

	@Override
	public Iterator<String> getIterator() {
		return new ConcreteIterator(items);
	}
}
