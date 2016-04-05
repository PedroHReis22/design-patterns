package curso.structural.flyweight;

public class State implements StateFlyweight {
	
	private int id;
	private String name;
	private String acronym;

	public State(String name) {
		this.name = name;
	}
	
	@Override
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public void setName(String name) {
		this.name = name;	
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setAcronym(String acronym) {
		this.acronym = acronym;
	}

	@Override
	public String getAcronym() {
		return acronym;
	}	

}
