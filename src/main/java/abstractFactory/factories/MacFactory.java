package abstractFactory.factories;

import abstractFactory.widgets.Botao;
import abstractFactory.widgets.Janela;
import abstractFactory.widgets.mac.MacBotao;
import abstractFactory.widgets.mac.MacJanela;

public class MacFactory implements AbstractFactory {

	@Override
	public Janela criarJanela() {
		return new MacJanela();
	}

	@Override
	public Botao criarBotao() {
		return new MacBotao();
	}

}
