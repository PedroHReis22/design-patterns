package curso.factory.bancos;

import java.util.List;

public interface Banco {
	
	public boolean salvar();
	
	public boolean alterar();
	
	public List<?> buscar();
	
	public boolean excluir();
	
}
