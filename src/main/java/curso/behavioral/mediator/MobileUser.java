package curso.behavioral.mediator;

public class MobileUser extends User {
	
	public MobileUser(Mediator mediator) {
		super(mediator);
	}
	
	@Override
	public void receive(String message) {
		System.out.println("MobileUser - Mensagem recebida: " + message);
	}

}
