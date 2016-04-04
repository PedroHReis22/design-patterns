package curso.structural.composite;

import java.util.List;
import java.util.NoSuchElementException;

public abstract class AbstractEmployee {
	
	protected String name;
	protected long salary;
	protected boolean leaf = true;
	
	public abstract boolean add(AbstractEmployee e) 
			throws NoSuchElementException;
	
	public abstract void remove(AbstractEmployee e)
	      throws NoSuchElementException;
	
	public abstract List<AbstractEmployee> getSubordinates();
	
	public abstract AbstractEmployee getChild(String s);
	
	public abstract long getSalarys();
	
	public boolean isLeaf() {
	    return leaf;
	}
	
	public String getName() {
		return name;
	}
	
	public long getSalary() {
		return salary;
	}
	
}