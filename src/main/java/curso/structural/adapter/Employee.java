package curso.structural.adapter;

import java.sql.ResultSet;

public class Employee {
	
	private int nrEmployee;
	private String name;
	private String departament;
	private double salary;
	
	public boolean create() {
		return true;
	}
	
	public boolean update() {
		return true;
	}
	
	public boolean delete() {
		return true;	
	}
	
	public ResultSet shearch(String filter) {
		return null;
	}
	
	public int getNrEmployee() {
		return nrEmployee;
	}
	
	public void setNrEmployee(int nrEmployee) {
		this.nrEmployee = nrEmployee;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDepartament() {
		return departament;
	}
	
	public void setDepartament(String departament) {
		this.departament = departament;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}

}
