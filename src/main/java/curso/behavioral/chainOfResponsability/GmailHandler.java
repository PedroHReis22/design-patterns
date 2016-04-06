package curso.behavioral.chainOfResponsability;

public class GmailHandler extends EmailHandler {

	@Override
	public String handleRequest(String email) {
		
		if(email.endsWith("@gmail.com")) {
			return "Email Gmail";
		}
		
		return next.handleRequest(email);

	}

}
