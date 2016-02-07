package curso.factory;

import java.util.List;

public class BancoMySql implements Banco {

	public boolean salvar() {
		return false;
	}

	public boolean alterar() {
		return false;
	}

	public List<?> buscar() {
		return null;
	}

	public boolean excluir() {
		return false;
	}

}