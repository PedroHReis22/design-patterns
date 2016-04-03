package curso.creational.abstractFactory.factories;

import curso.creational.abstractFactory.widgets.Botao;
import curso.creational.abstractFactory.widgets.Janela;

public interface AbstractFactory {
	
	public Janela criarJanela();
	
	public Botao criarBotao();

}
