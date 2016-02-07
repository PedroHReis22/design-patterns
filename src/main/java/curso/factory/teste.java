package curso.factory;

public class teste {

	public static void main(String[] args) {
		
		BancoFactory factory = new BancoFactory();
		Banco banco = factory.getBanco(BancoFactory.MYSQL);
		banco.salvar();

	}

}
