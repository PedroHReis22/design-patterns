package curso.structural.decorator;

public abstract class Team {
	
	private int id;
	private String name;
	
	public abstract void save();
	
	public abstract void update();

	public abstract void delete();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
