package structural;

import org.junit.Assert;
import org.junit.Test;

import curso.structural.adapter.Funcionario;
import curso.structural.adapter.FuncionarioAdapter;

public class AdapterTest {
	
	@Test
	public void testingAdapter() {
		
		int nr = 123;
		String name = "Nome Funcionário";
		String departament = "Departamento Teste";
		double salary = 1234.45;
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNrFucionario(nr);
		funcionario.setName(name);
		funcionario.setDepartament(departament);
		funcionario.setSalary(salary);
		
		FuncionarioAdapter adapter = new FuncionarioAdapter();
		adapter.setNrFucionario(nr);
		adapter.setName(name);
		adapter.setDepartament(departament);
		adapter.setSalary(salary);
		
		Assert.assertTrue(adapter.equals(funcionario));
		
	}

}
