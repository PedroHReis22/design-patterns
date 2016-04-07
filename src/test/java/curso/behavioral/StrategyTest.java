package curso.behavioral;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import curso.behavioral.strategy.MergeSort;

public class StrategyTest {

	@Test
	public void testingStrategy() {

		List<String> lista = new ArrayList<String>();

		lista.add("Samual");
		lista.add("Carlos");
		lista.add("Maria");
		lista.add("Ana");
		lista.add("João");

		MergeSort merge = new MergeSort();

		merge.sort(lista);
		

	}

}
