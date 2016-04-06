package curso.structural;

import org.junit.Assert;
import org.junit.Test;

import curso.structural.bridge.BaseList;
import curso.structural.bridge.ListAbstraction;
import curso.structural.bridge.OrderedListImpl;

public class BridgeTest {
	
	@Test
	public void testingBridge() {
		
		ListAbstraction baseList = new BaseList();
		baseList.setImplementor(new OrderedListImpl());
		
		baseList.add("Teste 1");
		baseList.add("Teste 2");
		baseList.add("Teste 3");
		baseList.add("Teste 4");
		baseList.add("Teste 5");
		
		Assert.assertEquals(baseList.count(), 5);
		Assert.assertEquals("Teste 1", baseList.get(0));
		Assert.assertEquals("Teste 2", baseList.get(1));
		Assert.assertEquals("Teste 3", baseList.get(2));
		Assert.assertEquals("Teste 4", baseList.get(3));
		Assert.assertEquals("Teste 5", baseList.get(4));
		
	}

}
