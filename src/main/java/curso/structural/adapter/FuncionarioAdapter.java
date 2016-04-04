package curso.structural.adapter;

import java.sql.ResultSet;

public class FuncionarioAdapter extends Funcionario {
	
	private Employee employee;
	
	public FuncionarioAdapter() {
		if(employee == null) employee = new Employee();
	}
	
	@Override
	public boolean salvar(Funcionario funcionario) {
		employee = clone(funcionario);
		return employee.create();
	}
	
	@Override
	public boolean atualizar(Funcionario funcionario) {
		employee = clone(funcionario);
		return employee.update();
	}
	
	@Override
	public boolean excluir(int nrFuncionario) {
		employee.setNrEmployee(nrFuncionario);
		return employee.delete();
	}
	
	@Override
	public ResultSet listaFuncionarios() {
		return employee.shearch(null);
	}
	
	@Override
	public ResultSet buscaFuncionarioPorNome(String nome) {
		return employee.shearch("nome LIKE '%'" + nome + "'%'");
	}
	
	@Override
	public ResultSet buscaFuncionario(int nrFuncionario) {
		return employee.shearch("nrFuncionario = " + nrFuncionario);
	}
	
	private Employee clone(Funcionario funcionario) {
		
		Employee employee = new Employee();
		
		employee.setNrEmployee(funcionario.getNrFucionario());
		employee.setName(funcionario.getName());
		employee.setDepartament(funcionario.getDepartament());
		employee.setSalary(funcionario.getSalary());
		
		return employee;
	}
	
	public int getNrEmployee() {
		return employee.getNrEmployee();
	}
	
	public void setNrEmployee(int nrEmployee) {
		employee.setNrEmployee(nrEmployee);
	}
	
	@Override
	public String getName() {
		return employee.getName();
	}
	
	@Override
	public void setName(String name) {
		employee.setName(name);
	}
	
	@Override
	public String getDepartament() {
		return employee.getDepartament();
	}
	
	@Override
	public void setDepartament(String departament) {
		employee.setDepartament(departament);
	}
	
	@Override
	public void setSalary(double salary) {
		employee.setSalary(salary);
	}
	
	@Override
	public double getSalary() {
		return employee.getSalary();
	}
	
	@Override
	public int getNrFucionario() {
		return employee.getNrEmployee();
	}
	
	@Override
	public void setNrFucionario(int nrFucionario) {
		employee.setNrEmployee(nrFucionario);
	}

	public boolean equals(Funcionario funcionario) {
		return employee.getNrEmployee() == funcionario.getNrFucionario() &&
			employee.getDepartament().equals(funcionario.getDepartament()) &&
			employee.getName().equals(funcionario.getName()) &&
			Double.compare(employee.getSalary(), funcionario.getSalary()) == 0;
	}

}
