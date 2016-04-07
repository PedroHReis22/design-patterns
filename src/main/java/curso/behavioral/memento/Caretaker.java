package curso.behavioral.memento;

public class Caretaker {
	
	private EmployeeMemento memento;
	
	public EmployeeMemento getMemento() {
		return memento;
	}
	
	public void setMemento(EmployeeMemento memento) {
		this.memento = memento;
	}

}
