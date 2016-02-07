package curso.factory.bancos;

import java.util.List;

public class BancoMySql implements Banco {

	@Override
	public boolean salvar() {
		System.out.println("Salvando MySql");
		return true;
	}

	@Override
	public boolean alterar() {
		System.out.println("Alterando MySql");
		return true;
	}

	@Override
	public List<?> buscar() {
		System.out.println("Buscando MySql");
		return null;
	}

	@Override
	public boolean excluir() {
		System.out.println("Excluindo MySql");
		return true;
	}

}