package curso.creational;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import curso.creational.factoryMethod.creators.AbstractCreator;
import curso.creational.factoryMethod.creators.ConnectionLoggerCretor;
import curso.creational.factoryMethod.creators.ReadFileLoggerCreator;
import curso.creational.factoryMethod.creators.WriteFileLoggerCreator;
import curso.creational.factoryMethod.creators.XMLLoggerCreator;
import curso.creational.factoryMethod.loggers.ConnectionLogger;
import curso.creational.factoryMethod.loggers.Logger;
import curso.creational.factoryMethod.loggers.ReadFileLogger;
import curso.creational.factoryMethod.loggers.WriteFileLogger;
import curso.creational.factoryMethod.loggers.XMLLogger;

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
