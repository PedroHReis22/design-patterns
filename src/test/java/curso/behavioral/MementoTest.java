package curso.behavioral;

import org.junit.Test;

import curso.behavioral.memento.Caretaker;
import curso.behavioral.memento.Employee;

public class MementoTest {
	
	@Test
	public void testingMemento() {
		
		Employee employee = new Employee(123, "Name", 23, "M", "XXXX-XXXX");
		
		Caretaker caretaker = new Caretaker();
		caretaker.setMemento(employee.saveState());
		
		System.out.println(employee);
		
		employee.setName("Novo nome");
		employee.setNr(465);
		employee.setPhone("YYYY-YYYY");
		
		System.out.println(employee);
		
		caretaker.getMemento().undo();
		
		System.out.println(employee);
		
	}

}
