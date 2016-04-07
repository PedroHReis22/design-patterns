package curso.behavioral;

import org.junit.Test;

import curso.behavioral.observer.Agent;
import curso.behavioral.observer.Bank;
import curso.behavioral.observer.OrdinaryShare;
import curso.behavioral.observer.Share;

public class ObserverTest {
	
	@Test
	public void testingObserver() {
		
		Share ordinaryShare = new OrdinaryShare();
		
		ordinaryShare.addInterested(new Agent());
		ordinaryShare.addInterested(new Bank());
		
		ordinaryShare.setValor(120.10);
		ordinaryShare.setValor(120.20);
		ordinaryShare.setValor(120.17);
	}

}
