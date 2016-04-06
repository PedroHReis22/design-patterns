package curso.behavioral.interpreter;

public class HundredExpression extends Expression {

	@Override
	protected String nove() {
		return "CM";
	}

	@Override
	protected String cinco() {
		return "D";
	}

	@Override
	protected String quatro() {
		return "CD";
	}

	@Override
	protected String um() {
		return "C";
	}

	@Override
	protected int multiplo() {
		return 100;
	}
	
}