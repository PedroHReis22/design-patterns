package curso.behavioral.chainOfResponsability;

public class BusinessEmailHandler extends EmailHandler {

	@Override
	public String handleRequest(String email) {
		
		if(email.endsWith("@business.com")) {
			return "Email Business";
		}
		
		return next.handleRequest(email);
	}	

}
