package curso.structural.composite;

import java.util.List;
import java.util.NoSuchElementException;

public class Employee extends AbstractEmployee {

	public Employee(String nome, long salario){
		this.name = nome;
	    this.salary = salario;
	}

	@Override
	public boolean add(AbstractEmployee e) throws NoSuchElementException {
		throw new NoSuchElementException("Employee não pode adicionar "
				+ "outro compomente");
	}

	@Override
	public void remove(AbstractEmployee e) throws NoSuchElementException {
		throw new NoSuchElementException("Employee não pode remover "
				+ "outro compomente");
	}

	@Override
	public List<AbstractEmployee> getSubordinates() {
		return null;
	}

	@Override
	public AbstractEmployee getChild(String s) {
		return null;
	}

	@Override
	public long getSalarys() {
		return salary;
	}
	
}