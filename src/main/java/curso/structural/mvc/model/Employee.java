package curso.structural.mvc.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import curso.structural.mvc.controller.EmployeeController;

public class Employee extends AbstractModel {
	
	private String INPUT_FILE = "/home/pedro/entrada.txt";
	private String OUTPUT_FILE = "/home/pedro/saida.txt";
	
	private String name;
	private double salary;
	
	private EmployeeController controller;
	
	public Employee(EmployeeController controller) {
		this.controller = controller;
		controller.setModel(this);
	}

	@Override
	public void save() {
		
		String row = name + ";" + salary;
		
		BufferedWriter writer = null;
		
		try {
			writer = new BufferedWriter(new FileWriter(OUTPUT_FILE));
			writer.write(row);
		} catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			if(writer != null) {
				try {
					writer.flush();
					writer.close();
				} catch (IOException e) { e.printStackTrace(); }
			}
		}
		
	}

	@Override
	public void alter() {
		save();
	}

	@Override
	public void delete() {
		
		File file = new File(INPUT_FILE);
		
		if(file.exists())
			file.delete();
	}

	@Override
	public void select() {
		
		BufferedReader read = null;
		
		try {
			
			read = new BufferedReader(new FileReader(INPUT_FILE));
			String str;
			
			while((str = read.readLine()) != null) {
				process(str);
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			
			if(read != null) {
				try { read.close(); }
				catch(IOException e) { e.printStackTrace(); }
			}
		}
		
	}
	
	private void process(String str) {
		
		String args[] = str.split(";");
		
		if(args.length > 0) {
			name = args[0];
			salary = Double.parseDouble(args[1]);
		}
		
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
