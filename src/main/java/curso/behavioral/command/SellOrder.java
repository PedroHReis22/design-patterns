package curso.behavioral.command;

public class SellOrder implements OrderCommand {
	
	private StockExchange stockExchange;
	
	public SellOrder(StockExchange stockExchange) {
		this.stockExchange = stockExchange;
	}
	
	@Override
	public void execute() {
		stockExchange.sell();
	}

}
