package curso.behavioral.interpreter;

public class DozenExpression extends Expression {

	@Override
	protected String nove() {
		return "XC";
	}

	@Override
	protected String cinco() {
		return "L";
	}

	@Override
	protected String quatro() {
		return "XL";
	}

	@Override
	protected String um() {
		return "X";
	}

	@Override
	protected int multiplo() {
		return 10;
	}
	
}