package curso.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Agent {
	
	private List<OrderCommand> orders = new ArrayList<>();
	
	public void add(OrderCommand order) {
		orders.add(order);
	}
	
	public void execute() {
		for(OrderCommand order : orders)
			order.execute();
	}

}
