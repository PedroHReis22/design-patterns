package curso;

import org.junit.Assert;
import org.junit.Test;

import curso.multiton.Camera;

public class MultitonTest {
	
	@Test
	public void testingMultiton() {
		
		Camera cam1 = Camera.getInstance(1234);
		Camera cam2 = Camera.getInstance(4321);
		
		if(!cam1.getLocation().equals("Left Store") || 
				!cam2.getLocation().equals("Right Store")) Assert.fail();
		
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testingWrongCamera() {
		Camera.getInstance(9876);
	}

}
