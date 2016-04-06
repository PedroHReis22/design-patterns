package curso.behavioral;

import org.junit.Assert;
import org.junit.Test;

import curso.behavioral.chainOfResponsability.BusinessEmailHandler;
import curso.behavioral.chainOfResponsability.EmailHandler;
import curso.behavioral.chainOfResponsability.GmailHandler;
import curso.behavioral.chainOfResponsability.OutlookHandler;

public class ChainOfResponsabilityTest {
	
	@Test
	public void testingGmail() {
		
		EmailHandler handler = createChain();
		
		Assert.assertEquals("Email Gmail", 
				handler.handleRequest("email@gmail.com"));
		
	}
	
	@Test
	public void testingBusiness() {
		
		EmailHandler handler = createChain();
		
		Assert.assertEquals("Email Business",
				handler.handleRequest("email@business.com"));
		
	}
	
	@Test
	public void testingOutlook() {
		
		EmailHandler handler = createChain();
		
		Assert.assertEquals("Email Outlook",
				handler.handleRequest("email@outlook.com"));
		
	}
	
	@Test(expected = NullPointerException.class)
	public void testingOtherEmail() {
		
		EmailHandler handler = createChain();
		
		handler.handleRequest("email@desconhecido.com");
		
	}
	
	private EmailHandler createChain() {
		
		EmailHandler business = new BusinessEmailHandler();
		EmailHandler gmail = new GmailHandler();
		EmailHandler outlook = new OutlookHandler();
		
		business.setNext(gmail);
		gmail.setNext(outlook);
		
		return business;
		
	}

}
