package curso.creational;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import curso.creational.simpleFactory.BancoFactory;
import curso.creational.simpleFactory.bancos.Banco;
import curso.creational.simpleFactory.bancos.BancoMySql;
import curso.creational.simpleFactory.bancos.BancoOracle;

public class SimpleFactoryTest {
	
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
