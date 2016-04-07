package curso.behavioral;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import curso.behavioral.nullObject.FactorySort;
import curso.behavioral.nullObject.SortList;

public class NullObjectTest {
	
	@Test
	public void testingNullObject() {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(30);
		list.add(13);
		list.add(11);
		list.add(44);
		list.add(3);
		
		List<Integer> clone = new ArrayList<>(list);

		FactorySort factory = new FactorySort();

		SortList ordernar = factory.getSort("MergeSort");
		ordernar.sort(list);
		
		Assert.assertEquals(list, clone);
		
	}

}
