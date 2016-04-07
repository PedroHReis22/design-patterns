package curso.behavioral;

import org.junit.Test;

import curso.behavioral.mediator.CentralMediator;
import curso.behavioral.mediator.ChatUser;
import curso.behavioral.mediator.MobileUser;
import curso.behavioral.mediator.User;

public class MediatorTest {
	
	@Test
	public void testingMediator() {
		
		CentralMediator mediator = new CentralMediator();

		User user1 = new ChatUser(mediator);
		User user2 = new ChatUser(mediator);
		User userMobile1 = new MobileUser(mediator);

		mediator.addUsuario(user1);
		mediator.addUsuario(user2);
		mediator.addUsuario(userMobile1);

		user1.send("Hello World!");
		
	}

}
