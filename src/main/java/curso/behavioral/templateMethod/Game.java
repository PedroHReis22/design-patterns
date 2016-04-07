package curso.behavioral.templateMethod;

public abstract class Game {
	
	protected boolean active = false;

	private void run() {
		
		active = true;
		
		load();
		
		while (active) {
			update();
			print();
		}
		
		onload();
	}

	public void start() {
		run();
	}

	protected abstract void load();

	protected abstract void update();

	protected abstract void print();

	protected abstract void onload();
}