package curso.creational.factoryMethod.creators;

import curso.creational.factoryMethod.loggers.Logger;
import curso.creational.factoryMethod.loggers.XMLLogger;

public class XMLLoggerCreator extends AbstractCreator {

	@Override
	public Logger createLogger() {
		return new XMLLogger();
	}

}
