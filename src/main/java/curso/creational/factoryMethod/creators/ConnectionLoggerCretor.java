package curso.creational.factoryMethod.creators;

import curso.creational.factoryMethod.loggers.ConnectionLogger;
import curso.creational.factoryMethod.loggers.Logger;

public class ConnectionLoggerCretor extends AbstractCreator {

	@Override
	public Logger createLogger() {
		return new ConnectionLogger();
	}

}
