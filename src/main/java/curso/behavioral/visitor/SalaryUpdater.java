package curso.behavioral.visitor;

public class SalaryUpdater implements EmployeeUpdater {
	
	private double readjustment;
	
	public SalaryUpdater(double readjustment) {
		this.readjustment = readjustment;
	}
	
	public double getReadjustment() {
		return readjustment;
	}
	
	public void setReadjustment(double readjustment) {
		this.readjustment = readjustment;
	}

	@Override
	public void update(Employee employee) {
		employee.setSalary(employee.getSalary() * readjustment);
	}
	
}
