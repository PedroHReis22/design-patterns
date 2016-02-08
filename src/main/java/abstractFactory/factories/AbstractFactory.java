package abstractFactory.factories;

import abstractFactory.widgets.Botao;
import abstractFactory.widgets.Janela;

public interface AbstractFactory {
	
	public Janela criarJanela();
	
	public Botao criarBotao();

}
