package curso.abstractFactory.factories;

import curso.abstractFactory.widgets.Botao;
import curso.abstractFactory.widgets.Janela;
import curso.abstractFactory.widgets.mac.MacBotao;
import curso.abstractFactory.widgets.mac.MacJanela;

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
