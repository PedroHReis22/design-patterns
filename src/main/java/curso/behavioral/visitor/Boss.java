package curso.behavioral.visitor;

public class Boss extends Employee {

	private String password;
	
	public Boss(int num, String name, double salary, String password) {
		super(num, name, salary);
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public void accept(EmployeeUpdater employeeUpdater) {
		employeeUpdater.update(this);
	}

}
