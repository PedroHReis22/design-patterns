package curso.creational;

import org.junit.Assert;
import org.junit.Test;

import curso.creational.prototype.Janela;

public class Prototype {
	
	@Test
	public void testingPrototype() {
		
		Janela janela1 = new Janela();
		janela1.setTitulo("Janela 1");
		janela1.setAltura(400);
		janela1.setLargura(600);

		Janela janela2 = janela1.clone();
		janela2.setTitulo("Janela 2");
		
		if(janela1.getAltura() != janela2.getAltura() || 
				janela1.getLargura() != janela2.getLargura() ||
				janela1.getTitulo().equals(janela2.getTitulo())) Assert.fail(); ;		
	}

}
