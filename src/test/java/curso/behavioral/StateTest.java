package curso.behavioral;

import org.junit.Assert;
import org.junit.Test;

import curso.behavioral.state.Account;

public class StateTest {
	
	@Test
	public void testingPositiveAccount() {
		
		Account account = new Account(132);
		
		account.deposit(150.00);
		Assert.assertEquals(true, account.loan(500));
		
		Assert.assertEquals(false, account.loan(5000));
		
		account.deposit(400);
		
		Assert.assertEquals(true, account.loan(5000));
		
		account.withdrawal(6500);
		Assert.assertEquals(false, account.loan(10));
		
		account.deposit(400);
		Assert.assertEquals(true, account.loan(50));
		
		Assert.assertEquals(0.0, account.getBalance(), 0);
		
	}

}
