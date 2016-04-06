package curso.behavioral.chainOfResponsability;

public abstract class EmailHandler {
	
	protected EmailHandler next;
	
	public abstract String handleRequest(String email);
	
	public void setNext(EmailHandler next) {
		this.next = next;
	}

}
