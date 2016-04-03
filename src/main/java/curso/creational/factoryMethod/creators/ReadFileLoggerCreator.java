package curso.creational.factoryMethod.creators;

import curso.creational.factoryMethod.loggers.Logger;
import curso.creational.factoryMethod.loggers.ReadFileLogger;

public class ReadFileLoggerCreator extends AbstractCreator {

	@Override
	public Logger createLogger() {
		return new ReadFileLogger();
	}

}
