package curso.creational.factoryMethod.creators;

import curso.creational.factoryMethod.loggers.Logger;

public abstract class AbstractCreator {
	
	public abstract Logger createLogger();
	
	public Logger getLogger() {
		return createLogger();
	}

}
