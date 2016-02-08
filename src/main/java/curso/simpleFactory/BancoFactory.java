package curso.simpleFactory;

import curso.simpleFactory.bancos.Banco;
import curso.simpleFactory.bancos.BancoMySql;
import curso.simpleFactory.bancos.BancoOracle;

public class BancoFactory {
	
	public static final int ORACLE = 0;
	public static final int MYSQL = 1;
	
	public Banco getBanco(int tipoBanco) {
		
		if(tipoBanco == ORACLE)
			return new BancoOracle();
		else if(tipoBanco == MYSQL)
			return new BancoMySql();
		else
			throw new IllegalArgumentException("Banco não suportado");
		
	}

}
