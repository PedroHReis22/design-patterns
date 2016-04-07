package curso.behavioral;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import curso.behavioral.visitor.Attendant;
import curso.behavioral.visitor.Boss;
import curso.behavioral.visitor.Departament;
import curso.behavioral.visitor.Employee;
import curso.behavioral.visitor.EmployeeUpdater;
import curso.behavioral.visitor.SalaryUpdater;

public class VisitorTest {

	@Test
	public void testingVisitor() {

		Employee bossMkv = new Boss(1, "Carlos", 4000.00, "123");
		Employee atendMkv1 = new Attendant(10, "Maria", 1000.00, "349");
		Employee atendMkv2 = new Attendant(11, "João", 1200.00, "359");

		Departament mkv = new Departament();
		mkv.add(bossMkv);
		mkv.add(atendMkv1);
		mkv.add(atendMkv2);

		Employee boosSell = new Boss(2, "Henrique", 5000.00, "456");
		Employee atendSell1 = new Attendant(12, "José", 1200.00, "455");
		Employee atendSell2 = new Attendant(13, "Ana", 800.00, "879");

		Departament sells = new Departament();
		sells.add(boosSell);
		sells.add(atendSell1);
		sells.add(atendSell2);

		List<Departament> departaments = new ArrayList<>();
		departaments.add(mkv);
		departaments.add(sells);

		EmployeeUpdater updater = new SalaryUpdater(1.1);

		for (Departament d : departaments) {

			for (Employee e : d.getEmployees()) {

				if (e instanceof Boss)
					updater.update((Boss) e);
				else if (e instanceof Attendant) {
					updater.update((Attendant) e);
				}
				
			}
		}
		
		for (Departament d : departaments) {

			for (Employee e : d.getEmployees()) {
				System.out.println(e.getSalary());
			}
		}

	}

}
