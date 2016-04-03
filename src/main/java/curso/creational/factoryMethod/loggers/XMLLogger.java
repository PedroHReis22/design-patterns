package curso.creational.factoryMethod.loggers;

public class XMLLogger implements Logger {

	@Override
	public void log(String mensagem) {
		System.err.println("Erro em XML: " + mensagem);
	}

}
