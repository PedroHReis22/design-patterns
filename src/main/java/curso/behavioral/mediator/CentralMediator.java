package curso.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class CentralMediator implements Mediator {

	private List<User> users;

	public CentralMediator() {
		users = new ArrayList<User>();
	}

	public void addUsuario(User user) {
		this.users.add(user);
	}

	@Override
	public void send(String message, User from) {
		for (User usuario : users) {
			if (usuario != from)
				usuario.receive(message);
		}
	}
}