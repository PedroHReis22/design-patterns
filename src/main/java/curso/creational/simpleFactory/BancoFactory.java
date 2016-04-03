package curso.creational.simpleFactory;

import curso.creational.simpleFactory.bancos.Banco;
import curso.creational.simpleFactory.bancos.BancoMySql;
import curso.creational.simpleFactory.bancos.BancoOracle;

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
