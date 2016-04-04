package structural;

import org.junit.Assert;
import org.junit.Test;

import curso.structural.decorator.BasicTeam;
import curso.structural.decorator.Team;
import curso.structural.decorator.TempTeam;

public class DecoratorTest {
	
	@Test
	public void testingDecorator() {
		
		Team team = new BasicTeam();
		team.setId(1);
		team.setName("Turma Temporária");
		
		TempTeam tempTeam = new TempTeam(team);
		tempTeam.save();
		
		Assert.assertEquals("Contrato", tempTeam.getContract());
		
	}

}
