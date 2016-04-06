package curso.behavioral.chainOfResponsability;

public class OutlookHandler extends EmailHandler {

	@Override
	public String handleRequest(String email) {
		
		if(email.endsWith("@outlook.com")) {
			return "Email Outlook";
		}
		
		return next.handleRequest(email);
	}

}
