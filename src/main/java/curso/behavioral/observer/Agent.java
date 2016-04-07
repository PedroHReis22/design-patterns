package curso.behavioral.observer;

public class Agent implements Observer {

	@Override
	public void update(Share share, double value) {
		System.out.println("Update Agent - Valor: " + value);
	}

}
