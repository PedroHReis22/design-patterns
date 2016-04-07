package curso.behavioral.mediator;

public class ChatUser extends User {
	
	public ChatUser(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void receive(String message) {
		System.out.println("ChatUser - Mensagem recebida: " + message);
	}

}

