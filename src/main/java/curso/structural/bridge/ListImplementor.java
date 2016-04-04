package curso.structural.bridge;

public interface ListImplementor {
	
	public void addItem(String item);
	
	public void addItem(String item, int index);
	
	public void removeItem(String item);
	
	public int getNumberOfItems();
	
	public String getItem(int index);
	
	public boolean isSupportsOrdering();
	
}