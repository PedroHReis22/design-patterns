package curso.factoryMethod.creators;

import curso.factoryMethod.loggers.Logger;
import curso.factoryMethod.loggers.XMLLogger;

public class XMLLoggerCreator extends AbstractCreator {

	@Override
	public Logger createLogger() {
		return new XMLLogger();
	}

}
