package structural;

import org.junit.Assert;

import curso.structural.composite.AbstractEmployee;
import curso.structural.composite.Boss;
import curso.structural.composite.Employee;

public class CompositeTest {
	
	public void testingComposite() {
		
		AbstractEmployee ceo = new Boss("Presidente", 20000);
		AbstractEmployee mkt = new Boss("Diretor Marketing", 10000);
		AbstractEmployee employee1 = new Employee("Empregado 1", 2000);
		AbstractEmployee employee2 = new Employee("Empregado 2", 2500);
		
		ceo.add(mkt);
		
		mkt.add(employee1);
		mkt.add(employee2);
		
		Assert.assertEquals(14500, mkt.getSalarys());
		Assert.assertEquals(34500, ceo.getSalarys());
		
	}

}
