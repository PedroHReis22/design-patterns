package curso.multiton.objectPool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionPool extends ObjectPool<Connection> {
	
	private String dsn;
	private String usr;
	private String pwd;
	
	public ConnectionPool(String driver, String dsn, String usr, 
			String pwd) {
		
		this.dsn = dsn;
		this.usr = usr;
		this.pwd = pwd;
		
		try { Class.forName(driver).newInstance(); }
		catch (Exception e) { e.printStackTrace(); }
		
	}

	@Override
	protected Connection create() {
		
		try { return DriverManager.getConnection(dsn, usr, pwd); }
		catch (SQLException e){ e.printStackTrace(); }
		
		return null;
	}

	@Override
	public boolean validate(Connection t) {
		
		try { return !((Connection) t).isClosed(); }
		catch (SQLException e){ e.printStackTrace(); }
		
		return false;
	}

	@Override
	public void expire(Connection t) {
		
		try { ((Connection) t).close(); }
		catch (SQLException e){ e.printStackTrace(); }
		
	}

}
