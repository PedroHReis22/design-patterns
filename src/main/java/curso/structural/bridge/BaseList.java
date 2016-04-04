package curso.structural.bridge;

public class BaseList implements ListAbstraction {
	
	private ListImplementor implementator;

	@Override
	public void setImplementor(ListImplementor impl) {
		implementator = impl;
	}

	@Override
	public void add(String item) {
		implementator.addItem(item);
	}

	@Override
	public void add(String item, int position) {
		implementator.addItem(item, position);
	}

	@Override
	public void remove(String item) {
		implementator.removeItem(item);
	}

	@Override
	public String get(int index) {
		return implementator.getItem(index);
	}

	@Override
	public int count() {
		return implementator.getNumberOfItems();
	}

}
