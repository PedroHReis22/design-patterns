package curso.structural.proxy;

import java.util.List;

public interface Provider {
	
	public boolean save();

	public boolean alter();
	
	public boolean delete();
	
	public List<DefaultProvider> list();
	
}