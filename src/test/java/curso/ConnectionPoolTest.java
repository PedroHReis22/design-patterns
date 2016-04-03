package curso;

import java.sql.Connection;

import org.junit.Assert;
import org.junit.Test;

import curso.objectPool.ConnectionPool;

public class ConnectionPoolTest {
	
	@Test
	public void testingSameConnection() {
		
		ConnectionPool connectionPool = 
				new ConnectionPool("com.mysql.jdbc.Driver", 
						"jdbc:mysql://localhost:3306", "root", "pedro2201");
		
		Connection connection1 = connectionPool.acquire();
		//usa conexão
		connectionPool.release(connection1);
		
		try { Thread.sleep(connectionPool.getExpirationTime() / 2); }
		catch (InterruptedException e) { e.printStackTrace(); }
		
		Connection connection2 = connectionPool.acquire();
		
		Assert.assertSame("Testando a mesma conexão", connection1, connection2);
		
	}
	
	@Test
	public void testingDiffConnections() {
		
		ConnectionPool connectionPool = 
				new ConnectionPool("com.mysql.jdbc.Driver", 
						"jdbc:mysql://localhost:3306", "root", "pedro2201");
		
		Connection connection1 = connectionPool.acquire();
		//usa conexão
		connectionPool.release(connection1);
		
		try { Thread.sleep(connectionPool.getExpirationTime()); }
		catch (InterruptedException e) { e.printStackTrace(); }
		
		Connection connection2 = connectionPool.acquire();
		
		Assert.assertNotSame("Testando conexões diferentes", connection1, connection2);
		
	}

}
