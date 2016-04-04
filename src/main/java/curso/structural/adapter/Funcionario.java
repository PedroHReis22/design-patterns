package curso.structural.adapter;

import java.sql.ResultSet;

public class Funcionario {
	
	private int nrFuncionario;
	private String name;
	private String departament;
	private double salary;
	
	public boolean salvar(Funcionario funcionario) {
		return true;
	}
	
	public boolean atualizar(Funcionario funcionario) {
		return true;
	}
	
	public boolean excluir(int nrFuncionario) {
		return true;	
	}
	
	public ResultSet listaFuncionarios() {
		return null;
	}
	
	public ResultSet buscaFuncionarioPorNome(String nome) {
		return null;
	}
	
	public ResultSet buscaFuncionario(int nrFuncionario) {
		return null;
	}
	
	public int getNrFucionario() {
		return nrFuncionario;
	}
	
	public void setNrFucionario(int nrFucionario) {
		this.nrFuncionario = nrFucionario;
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
