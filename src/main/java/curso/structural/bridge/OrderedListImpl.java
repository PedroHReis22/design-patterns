package curso.structural.bridge;

import java.util.ArrayList;
import java.util.List;

public class OrderedListImpl implements ListImplementor {
	
	private List<String> items;
	
	public OrderedListImpl() {
		items = new ArrayList<>();
	}

	@Override
	public void addItem(String item) {
		if(!items.contains(item))
			items.add(item);
	}

	@Override
	public void addItem(String item, int index) {
		if(!items.contains(item))
			items.add(index, item);
	}

	@Override
	public void removeItem(String item) {
		if(items.contains(item))
			items.remove(item);
	}

	@Override
	public int getNumberOfItems() {
		return items.size();
	}

	@Override
	public String getItem(int index) {
		return (index < items.size()) ? items.get(index) : null;
	}

	@Override
	public boolean isSupportsOrdering() {
		return true;
	}

}
