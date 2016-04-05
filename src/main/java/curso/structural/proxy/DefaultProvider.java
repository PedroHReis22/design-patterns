package curso.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class DefaultProvider implements Provider {

	@Override
	public boolean save() {
		//implementation
		return true;
	}

	@Override
	public boolean alter() {
		//implementation
		return true;
	}

	@Override
	public boolean delete() {
		//implementation
		return true;
	}

	@Override
	public List<DefaultProvider> list() {
		return new ArrayList<DefaultProvider>();
	}

}
