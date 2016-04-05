package curso.structural.flyweight;

import java.util.HashMap;

public class FactoryFlyweight {
	
	private static HashMap<String, State> states = new HashMap<>();
	
	public static State getState(String name) {
		
		if(states.containsKey(name))
			states.put(name, new State(name));
		
		return states.get(name);
	}

}
