package curso.behavioral;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import curso.behavioral.interpreter.Context;
import curso.behavioral.interpreter.DozenExpression;
import curso.behavioral.interpreter.Expression;
import curso.behavioral.interpreter.HundredExpression;
import curso.behavioral.interpreter.ThousandExpression;
import curso.behavioral.interpreter.UnitaryExpression;

public class InterpreterTest {
	
	@Test
	public void testingInterpreter() {
		
		String roman = "MCMXXVIII";
		
		Context context = new Context();
		context.setInput(roman);
		
		List<Expression> tree = new ArrayList<>();
		tree.add(new ThousandExpression());
		tree.add(new HundredExpression());
		tree.add(new DozenExpression());
		tree.add(new UnitaryExpression());
		
		for(Expression expression : tree)
			expression.interpreter(context);
		
		Assert.assertEquals(1928, context.getOutput());
		
	}

}



//String resultado = String.valueOf(contexto.getOutput());