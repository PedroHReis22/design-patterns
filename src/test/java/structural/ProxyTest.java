package structural;

import curso.structural.proxy.DefaultProvider;
import curso.structural.proxy.Provider;
import curso.structural.proxy.ProxyProvider;

public class ProxyTest {
	
	public void testingProxy() {
		
		Provider proxy = new ProxyProvider(new DefaultProvider());
		
		proxy.alter();
		proxy.delete();
		proxy.save();
		proxy.list();
		
	}

}
