package curso.factoryMethod.creators;

import curso.factoryMethod.loggers.Logger;

public abstract class AbstractCreator {
	
	public abstract Logger createLogger();
	
	public Logger getLogger() {
		return createLogger();
	}

}
