package curso.abstractFactory.factories;

import curso.abstractFactory.widgets.Botao;
import curso.abstractFactory.widgets.Janela;

public interface AbstractFactory {
	
	public Janela criarJanela();
	
	public Botao criarBotao();

}
