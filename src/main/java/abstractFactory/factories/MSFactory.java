package abstractFactory.factories;

import abstractFactory.widgets.Botao;
import abstractFactory.widgets.Janela;
import abstractFactory.widgets.windows.MSBotao;
import abstractFactory.widgets.windows.MSJanela;

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
