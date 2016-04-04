package curso.structural.decorator;

public class TempTeam extends TeamDecorator {
	
	String contract;
	
	public TempTeam(Team team) {
		super(team);
	}

	@Override
	public void save() {
		//implementation
		getTeam().save();
	}

	@Override
	public void update() {
		//implementation
		getTeam().update();
	}

	@Override
	public void delete() {
		//implementation
		getTeam().delete();
	}
	
	public String getContract() {
		contract = "Contrato";
		return contract;
	}

}
