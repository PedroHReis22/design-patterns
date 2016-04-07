package curso.behavioral.state;

public class NegativeAccount implements StatusAccount {
	
	private Account account;
	
	public NegativeAccount(Account account) {
		this.account = account;
	}
	
	@Override
	public boolean loan(double value) {
		return account.getBalance() > -100 && value < 1000; 
	}

}
