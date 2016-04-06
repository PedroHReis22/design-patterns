package curso.structural;

import org.junit.Test;

import curso.structural.mvc.controller.EmployeeController;
import curso.structural.mvc.model.Employee;
import curso.structural.mvc.view.EmployeeView;

public class MVCTest {
	
	@Test
	public void testingMVC() {
		
		EmployeeController controller = new EmployeeController();
		EmployeeView view = new EmployeeView(controller);
		
		Employee employee = new Employee(controller);
		employee.select();
		
		view.display(employee);
		
		controller.edit("Novo nome", 9876.54);
		employee.save();
		
		view.display(employee);
		
	}

}
