package structural;

import org.junit.Test;

import curso.structural.facade.Financial;
import curso.structural.facade.Fiscal;
import curso.structural.facade.Order;
import curso.structural.facade.OrderFacade;
import curso.structural.facade.Stock;

public class FacadeTest {
	
	@Test
	public void testingOrderAccomplish() {
		
		Order order = new Order(1); 
		
		Stock stock = new Stock();
		Financial financial = new Financial();
		Fiscal fiscal = new Fiscal();
		
		stock.productsReserver(order);
		financial.received(order);
		fiscal.taxCalculate(order);
		
		new OrderFacade(stock, financial, fiscal).orderAccomplish(order);
		
	}
	
	@Test
	public void testingOrderCancel() {
		
		Order order = new Order(1); 
		
		Stock stock = new Stock();
		Financial financial = new Financial();
		Fiscal fiscal = new Fiscal();
		
		stock.releaseStock(order);
		financial.releaseValue(order);
		fiscal.cancelateOrder(order);
		
		new OrderFacade(stock, financial, fiscal).orderCancel(order);
		
	}

}
