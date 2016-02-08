package curso.abstractFactory.factories;

import curso.abstractFactory.widgets.Botao;
import curso.abstractFactory.widgets.Janela;
import curso.abstractFactory.widgets.windows.MSBotao;
import curso.abstractFactory.widgets.windows.MSJanela;

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
