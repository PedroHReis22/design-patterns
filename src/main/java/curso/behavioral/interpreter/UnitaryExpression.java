package curso.behavioral.interpreter;


public class UnitaryExpression extends Expression {

	@Override
	protected String nove() {
		return "IX";
	}

	@Override
	protected String cinco() {
		return "V";
	}

	@Override
	protected String quatro() {
		return "IV";
	}

	@Override
	protected String um() {
		return "I";
	}

	@Override
	protected int multiplo() {
		return 1;
	}
	
}