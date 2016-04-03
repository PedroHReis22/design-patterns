package curso.creational.simpleFactory.bancos;

import java.util.List;

public class BancoOracle implements Banco {

	@Override
	public boolean salvar() {
		System.out.println("Salvando Oracle");
		return false;
	}

	@Override
	public boolean alterar() {
		System.out.println("Alterando Oracle");
		return false;
	}

	@Override
	public List<?> buscar() {
		System.out.println("Buscando Oracle");
		return null;
	}

	@Override
	public boolean excluir() {
		System.out.println("Excluindo Oracle");
		return false;
	}

}
