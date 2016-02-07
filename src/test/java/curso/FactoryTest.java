package curso;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import curso.factory.BancoFactory;
import curso.factory.bancos.Banco;
import curso.factory.bancos.BancoMySql;
import curso.factory.bancos.BancoOracle;

public class FactoryTest {
	
	@Test
	public void testingGetBancoOracle() {
		
		BancoFactory bancoFactory = new BancoFactory();
		Banco banco = bancoFactory.getBanco(BancoFactory.ORACLE);
		
		assertEquals("Testando banco Oracle", BancoOracle.class, 
				banco.getClass());
	}
	
	@Test
	public void testingGetBancoMySql() {
		
		BancoFactory bancoFactory = new BancoFactory();
		Banco banco = bancoFactory.getBanco(BancoFactory.MYSQL);
		
		assertEquals("Testando banco MySql", BancoMySql.class, 
				banco.getClass());
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testingGetBancoDesconhecido() {
		
		BancoFactory bancoFactory = new BancoFactory();
		bancoFactory.getBanco(-1);
		
	}

}
