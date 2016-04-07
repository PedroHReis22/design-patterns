package curso.behavioral.mediator;

public abstract class User {

	private Mediator mediator;
	
	public abstract void receive(String message);

	public User(Mediator mediator) {
		this.mediator = mediator;
	}

	public void send(String message) {
		this.mediator.send(message, this);
	}

	public Mediator getMediator() {
		return mediator;
	}

}