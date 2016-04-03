package curso.creational;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import curso.creational.abstractFactory.factories.AbstractFactory;
import curso.creational.abstractFactory.factories.MSFactory;
import curso.creational.abstractFactory.factories.MacFactory;
import curso.creational.abstractFactory.widgets.Botao;
import curso.creational.abstractFactory.widgets.Janela;
import curso.creational.abstractFactory.widgets.mac.MacBotao;
import curso.creational.abstractFactory.widgets.mac.MacJanela;
import curso.creational.abstractFactory.widgets.windows.MSBotao;
import curso.creational.abstractFactory.widgets.windows.MSJanela;

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
