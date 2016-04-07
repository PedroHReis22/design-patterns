package curso.behavioral.visitor;

public class Attendant extends Employee {

	private String branch;
	
	public Attendant(int num, String name, double salary, String branch) {
		super(num, name, salary);
		this.branch = branch;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public void accept(EmployeeUpdater employeeUpdater) {
		employeeUpdater.update(this);
	}

}
