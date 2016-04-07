package curso.behavioral.memento;

public class EmployeeMemento {
	
	private Employee target;
	
	private int nr;
	private String name;
	private int age;
	private String gender;
	private String phone;
	
	public EmployeeMemento(Employee employee) {
		target = employee;
		nr = employee.getNr();
		name = employee.getName();
		age = employee.getAge();
		gender = employee.getGender();
		phone = employee.getGender();
	}
	
	public void undo() {
		
		int newNr = nr;
		String newName = name;
		int newAge = age;
		String newGender = gender;
		String newPhone = phone;
		
		nr = target.getNr();
		name = target.getName();
		age = target.getAge();
		gender = target.getGender();
		phone = target.getPhone();
		
		target.setNr(newNr);
		target.setName(newName);
		target.setAge(newAge);
		target.setGender(newGender);
		target.setPhone(newPhone);
	}

}
