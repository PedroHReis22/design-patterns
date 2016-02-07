package curso;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import curso.factoryMethod.creators.AbstractCreator;
import curso.factoryMethod.creators.ConnectionLoggerCretor;
import curso.factoryMethod.creators.ReadFileLoggerCreator;
import curso.factoryMethod.creators.WriteFileLoggerCreator;
import curso.factoryMethod.creators.XMLLoggerCreator;
import curso.factoryMethod.loggers.ConnectionLogger;
import curso.factoryMethod.loggers.Logger;
import curso.factoryMethod.loggers.ReadFileLogger;
import curso.factoryMethod.loggers.WriteFileLogger;
import curso.factoryMethod.loggers.XMLLogger;

public class FactoryMethodTest {
	
	@Test
	public void testingConnectionLoggerCretor() {
		
		AbstractCreator creator = new ConnectionLoggerCretor();
		
		Logger logger = creator.getLogger();
		
		assertEquals("Testando Connection Logger Creator", ConnectionLogger.class,
				logger.getClass());
	}

	@Test
	public void testingReadFileLoggerCreator() {
		
		AbstractCreator creator = new ReadFileLoggerCreator();
		
		Logger logger = creator.getLogger();
		
		assertEquals("Testando Read File Creator", ReadFileLogger.class,
				logger.getClass());
	}
	
	@Test
	public void testingWriteFileLoggerCreator() {
		
		AbstractCreator creator = new WriteFileLoggerCreator();
		
		Logger logger = creator.getLogger();
		
		assertEquals("Testando Write File Creator", WriteFileLogger.class,
				logger.getClass());
		
	}
	
	@Test
	public void testingXMLLoggerCreator() {
		
		AbstractCreator creator = new XMLLoggerCreator();
		
		Logger logger = creator.getLogger();
		
		assertEquals("Testando XML Logger Creator", XMLLogger.class,
				logger.getClass());
		
	}
	
}
