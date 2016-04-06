package curso.behavioral;

import org.junit.Test;

import curso.behavioral.command.Agent;
import curso.behavioral.command.PurchaseOrder;
import curso.behavioral.command.SellOrder;
import curso.behavioral.command.StockExchange;

public class CommandTest {
	
	@Test
	public void testingCommand() {
		
		StockExchange stockExchange = new StockExchange();
		Agent agent = new Agent();
		
		agent.add(new PurchaseOrder(stockExchange));
		agent.add(new PurchaseOrder(stockExchange));
		agent.add(new SellOrder(stockExchange));
		agent.add(new PurchaseOrder(stockExchange));
		agent.add(new SellOrder(stockExchange));
		
	}

}
