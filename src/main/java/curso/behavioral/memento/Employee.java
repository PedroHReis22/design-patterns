package curso.behavioral.memento;

public class Employee {

	private int nr;
	private String name;
	private int age;
	private String gender;
	private String phone;
	
	public Employee(int nr, String name, int age, String gender, String phone) {
		this.nr = nr;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
	}
	
	public EmployeeMemento saveState() {
		return new EmployeeMemento(this);
	}
	
	public int getNr() {
		return nr;
	}

	public void setNr(int nr) {
		this.nr = nr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Employee [nr=" + nr + ", name=" + name + ", age=" + age + ", gender=" + gender + ", phone=" + phone + "]";
	}

}

