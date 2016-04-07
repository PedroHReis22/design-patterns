package curso.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Share {
	
	private List<Observer> interested = new ArrayList<Observer>();
	private double value;

	public void addInterested(Observer interested) {
		if(!this.interested.contains(interested))
			this.interested.add(interested);
	}

	public void removeInterested(Observer interested) {
		this.interested.remove(interested);
	}

	public double getValor() {
		return value;
	}

	public void setValor(double value) {
		
		this.value = value;
		
		for (Observer observer : interested)
			observer.update(this, value);
	}

	public abstract void purchase();

	public abstract void sell();
}