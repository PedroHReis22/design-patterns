package curso.structural.mvc.controller;

import curso.structural.mvc.model.AbstractModel;
import curso.structural.mvc.model.Employee;
import curso.structural.mvc.view.AbstractView;
import curso.structural.mvc.view.EmployeeView;

public class EmployeeController extends AbstractController {
	
	private Employee employee;
	private EmployeeView view;

	@Override
	public void init(AbstractModel model, AbstractView view) {
		employee = (Employee) model;
		view = (EmployeeView) view;
	}

	public Employee edit(String name, double salary) {
		employee.setName(name);
		employee.setSalary(salary);
		return employee;
	}
	
	public void setModel(AbstractModel model) {
		employee = (Employee) model;
	}
	
	public void setView(AbstractView view) {
		view = (EmployeeView) view;
	}
	
	public void index() {
		view.display(employee);
	}

}
