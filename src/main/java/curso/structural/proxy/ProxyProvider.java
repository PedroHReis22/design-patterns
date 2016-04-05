package curso.structural.proxy;

import java.util.List;

public class ProxyProvider implements Provider {
	
	private Provider provider;
	
	public ProxyProvider(Provider provider) {
		this.provider = provider;
	}

	@Override
	public boolean save() {
		return provider.save();
	}

	@Override
	public boolean alter() {
		return provider.alter();
	}

	@Override
	public boolean delete() {
		return provider.delete();
	}

	@Override
	public List<DefaultProvider> list() {
		return provider.list();
	}

}
