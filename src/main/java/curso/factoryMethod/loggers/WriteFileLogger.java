package curso.factoryMethod.loggers;

public class WriteFileLogger implements Logger {

	@Override
	public void log(String mensagem) {
		System.err.println("Erro na escrita do arquivo: " + mensagem);
	}

}
