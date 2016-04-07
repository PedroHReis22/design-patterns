package curso.behavioral.state;

public class Account {

	private int nr;
	private double balance;
	private StatusAccount status;
	
	public Account(int nr) {
		this.nr = nr;
		balance = 0.0;
	}
	
	public int getNr() {
		return nr;
	}

	public void setNr(int nr) {
		this.nr = nr;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public StatusAccount getStatus() {
		return status;
	}

	public void setStatus(StatusAccount status) {
		this.status = status;
	}
	
	public void withdrawal(double value) {
		balance -= value;
		if(balance < 0) status = new NegativeAccount(this);
	}
	
	public void deposit(double value) {
		balance += value;
		if(balance > 0) status = new PositiveAccount(this);
	}
	
	public boolean loan(double value) {
		
		if(status.loan(value)) {
			balance += value;
			return true;
		}
		
		return false;
		
	}
	
}

