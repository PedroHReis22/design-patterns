package curso.behavioral;

import org.junit.Test;

import curso.behavioral.iterator.Items;
import curso.behavioral.iterator.Iterator;

public class IteratorTest {
	
	@Test
	public void testingIterator() {
		
		Items items = new Items();
		
		items.add("Item 1");
		items.add("Item 2");
		items.add("Item 3");
		items.add("Item 4");
		items.add("Item 5");
		
		Iterator<String> iterator = items.getIterator();
		
		while(!iterator.isDone())
			System.out.println(iterator.next());
	}

}
