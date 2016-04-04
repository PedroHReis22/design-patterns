package curso.structural.decorator;

public abstract class TeamDecorator {
	
	private Team team;
	
	public TeamDecorator(Team team) {
		this.team = team;
	}
	
	public abstract void save();
	
	public abstract void update();

	public abstract void delete();
	
	public Team getTeam() {
		return team;
	}
	
}
