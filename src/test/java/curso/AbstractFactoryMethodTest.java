package curso;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import abstractFactory.factories.AbstractFactory;
import abstractFactory.factories.MSFactory;
import abstractFactory.factories.MacFactory;
import abstractFactory.widgets.Botao;
import abstractFactory.widgets.Janela;
import abstractFactory.widgets.mac.MacBotao;
import abstractFactory.widgets.mac.MacJanela;
import abstractFactory.widgets.windows.MSBotao;
import abstractFactory.widgets.windows.MSJanela;

public class AbstractFactoryMethodTest {
	
	@Test
	public void testingJanelaWindows() {
		
		AbstractFactory factory = new MSFactory();
		
		Janela janela = factory.criarJanela();
		
		assertEquals(janela.getClass(), MSJanela.class);
	}
	
	@Test
	public void testingJanelaMac() {
		
		AbstractFactory factory = new MacFactory();
		
		Janela janela = factory.criarJanela();
		
		assertEquals(janela.getClass(), MacJanela.class);
		
	}
	
	@Test
	public void testingBotaoWindows() {
		
		AbstractFactory factory = new MSFactory();
		
		Botao botao = factory.criarBotao();
		
		assertEquals(botao.getClass(), MSBotao.class);
	}
	
	@Test
	public void testingBotaoMac() {
		
		AbstractFactory factory = new MacFactory();
		
		Botao botao = factory.criarBotao();
		
		assertEquals(botao.getClass(), MacBotao.class);
	}

}
