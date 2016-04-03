package curso.creational.abstractFactory.factories;

import curso.creational.abstractFactory.widgets.Botao;
import curso.creational.abstractFactory.widgets.Janela;
import curso.creational.abstractFactory.widgets.windows.MSBotao;
import curso.creational.abstractFactory.widgets.windows.MSJanela;

public class MSFactory implements AbstractFactory {

	@Override
	public Janela criarJanela() {
		return new MSJanela();
	}

	@Override
	public Botao criarBotao() {
		return new MSBotao();
	}	

}
