package curso.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Departament implements Updater {
	
	private String name;
	private String phone;
	
	private List<Employee> employees;
	
	public Departament() {
		employees = new ArrayList<>();
	}
	
	public void add(Employee employee) {
		employees.add(employee);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public void accept(EmployeeUpdater employeeUpdater) {
		for(Employee employee : employees)
			employeeUpdater.update(employee);
	}

}
