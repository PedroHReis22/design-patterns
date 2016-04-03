package curso.creational.abstractFactory.factories;

import curso.creational.abstractFactory.widgets.Botao;
import curso.creational.abstractFactory.widgets.Janela;
import curso.creational.abstractFactory.widgets.mac.MacBotao;
import curso.creational.abstractFactory.widgets.mac.MacJanela;

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
