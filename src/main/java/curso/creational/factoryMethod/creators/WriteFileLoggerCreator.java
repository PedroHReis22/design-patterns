package curso.creational.factoryMethod.creators;

import curso.creational.factoryMethod.loggers.Logger;
import curso.creational.factoryMethod.loggers.WriteFileLogger;

public class WriteFileLoggerCreator extends AbstractCreator {

	@Override
	public Logger createLogger() {
		return new WriteFileLogger();
	}

}
