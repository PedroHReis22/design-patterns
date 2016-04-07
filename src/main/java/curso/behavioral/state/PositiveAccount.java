package curso.behavioral.state;

public class PositiveAccount implements StatusAccount {
	
	private Account account;
	
	public PositiveAccount(Account account) {
		this.account = account;
	}
	
	@Override
	public boolean loan(double value) {
		
		if(account.getBalance() > 100 && value < 1000)
			return true;
		else if(account.getBalance() > 1000)
			return true;
		else return false;
		 
	}

}
