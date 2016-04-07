package curso.behavioral;

import org.junit.Test;

import curso.behavioral.templateMethod.Game;
import curso.behavioral.templateMethod.Game1;

public class TemplateMethodTest {
	
	@Test
	public void testingTemplateMethod() {
		
		Game game = new Game1();
		game.start();
		
	}

}
