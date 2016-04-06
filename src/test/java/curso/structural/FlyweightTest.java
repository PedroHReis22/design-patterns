package curso.structural;

import org.junit.Assert;
import org.junit.Test;

import curso.structural.flyweight.FactoryFlyweight;
import curso.structural.flyweight.State;

public class FlyweightTest {
	
	@Test
	public void testingFlyweight() {
		
		State s1 = FactoryFlyweight.getState("São Paulo");
		State s2 = FactoryFlyweight.getState("Rio de Janeiro");
		State s3 = FactoryFlyweight.getState("São Paulo");
		
		Assert.assertEquals(s1, s3);
	}

}
