package curso.structural.facade;

public class OrderFacade {
	
	private Stock stock;
	private Financial financial;
	private Fiscal fiscal;
	
	public OrderFacade(Stock stock, Financial financial, Fiscal fiscal) {
		this.stock = stock;
		this.financial = financial;
		this.fiscal = fiscal;
	}
	
	public void orderAccomplish(Order order) {
		stock.productsReserver(order);
		financial.received(order);
		fiscal.taxCalculate(order);
	}
	
	public void orderCancel(Order order) {
		stock.releaseStock(order);
		financial.releaseValue(order);
		fiscal.cancelateOrder(order);
	}

}
