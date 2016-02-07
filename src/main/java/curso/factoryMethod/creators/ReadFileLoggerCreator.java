package curso.factoryMethod.creators;

import curso.factoryMethod.loggers.Logger;
import curso.factoryMethod.loggers.ReadFileLogger;

public class ReadFileLoggerCreator extends AbstractCreator {

	@Override
	public Logger createLogger() {
		return new ReadFileLogger();
	}

}
