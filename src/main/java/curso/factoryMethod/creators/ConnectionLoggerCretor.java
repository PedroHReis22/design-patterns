package curso.factoryMethod.creators;

import curso.factoryMethod.loggers.ConnectionLogger;
import curso.factoryMethod.loggers.Logger;

public class ConnectionLoggerCretor extends AbstractCreator {

	@Override
	public Logger createLogger() {
		return new ConnectionLogger();
	}

}
