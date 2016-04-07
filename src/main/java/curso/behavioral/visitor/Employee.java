package curso.behavioral.visitor;

public abstract class Employee implements Updater {

	protected int num;
	protected String name;
	protected double salary;
	
	public Employee(int num, String name, double salary) {
		this.num = num;
		this.name = name;
		this.salary = salary;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
