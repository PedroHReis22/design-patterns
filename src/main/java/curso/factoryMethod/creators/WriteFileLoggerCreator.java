package curso.factoryMethod.creators;

import curso.factoryMethod.loggers.Logger;
import curso.factoryMethod.loggers.WriteFileLogger;

public class WriteFileLoggerCreator extends AbstractCreator {

	@Override
	public Logger createLogger() {
		return new WriteFileLogger();
	}

}
