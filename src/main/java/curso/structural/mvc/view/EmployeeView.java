package curso.structural.mvc.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import curso.structural.mvc.controller.EmployeeController;
import curso.structural.mvc.model.AbstractModel;
import curso.structural.mvc.model.Employee;

public class EmployeeView extends AbstractView {
	
	private EmployeeController controller;
	
	public EmployeeView(EmployeeController controller) {
		this.controller = controller;
		this.controller.setView(this);
	}

	@Override
	public void display(AbstractModel model) {
		
		Employee employee = (Employee) model;
		
		System.out.println("Nome do funcionário: " + employee.getName());
		System.out.println("Salario do funcionário: " + employee.getSalary());
		System.out.println("===========");
		
	}
	
	public void edit() {
		
		System.out.print("Entre com um nome: ");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			String name = br.readLine();
			double salary = Double.parseDouble(br.readLine());
			Employee employee = controller.edit(name, salary);
			
			display(employee);
			
		} catch(IOException | NumberFormatException e) { e.printStackTrace(); }
		
	}

}
