package curso.structural.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Boss extends AbstractEmployee {
	
	private List<AbstractEmployee> subordinates;
	
	public Boss(String name, long salary) {
		
		subordinates = new ArrayList<>();
		
		this.name = name;
		this.salary = salary;
		leaf = false;
	}

	@Override
	public boolean add(AbstractEmployee e) throws NoSuchElementException {
		return subordinates.add(e);
	}

	@Override
	public void remove(AbstractEmployee e) throws NoSuchElementException {
		subordinates.remove(e);
	}

	@Override
	public List<AbstractEmployee> getSubordinates() {
		return subordinates;
	}

	@Override
	public AbstractEmployee getChild(String s) {
		
		for(int i = 0; i < subordinates.size(); ++i)
			if(subordinates.get(i).getName().equals(s))
				return subordinates.get(i);
		
		return null;
	}

	@Override
	public long getSalarys() {
		
		long sum = salary;
		
		for(int i = 0; i < subordinates.size(); ++i)
			sum += subordinates.get(i).getSalary();
		
		return sum;
	}

}