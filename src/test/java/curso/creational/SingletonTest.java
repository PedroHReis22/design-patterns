package curso.creational;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import curso.creational.singleton.ConfigManager;

public class SingletonTest {
	
	@Test
	public void testingSingleton() {
		
		ConfigManager conf1 = ConfigManager.getInstance();
		ConfigManager conf2 = ConfigManager.getInstance();
		
		assertEquals(conf1, conf2);
		
	}

}
