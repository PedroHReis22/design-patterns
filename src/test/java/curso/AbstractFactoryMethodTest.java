package curso;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import curso.abstractFactory.factories.AbstractFactory;
import curso.abstractFactory.factories.MSFactory;
import curso.abstractFactory.factories.MacFactory;
import curso.abstractFactory.widgets.Botao;
import curso.abstractFactory.widgets.Janela;
import curso.abstractFactory.widgets.mac.MacBotao;
import curso.abstractFactory.widgets.mac.MacJanela;
import curso.abstractFactory.widgets.windows.MSBotao;
import curso.abstractFactory.widgets.windows.MSJanela;

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
