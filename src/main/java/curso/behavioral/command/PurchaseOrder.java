package curso.behavioral.command;

public class PurchaseOrder implements OrderCommand {
	
	private StockExchange stockExchange;

	public PurchaseOrder(StockExchange stockExchange) {
		this.stockExchange = stockExchange;
	}
	
	@Override
	public void execute() {
		stockExchange.purchase();
	}

}
