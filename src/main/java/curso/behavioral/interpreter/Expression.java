package curso.behavioral.interpreter;

public abstract class Expression {
	
	public void interpreter(Context context) {
		
		if (context.getInput().length() == 0)
			return;

		if (context.getInput().startsWith(nove())) {
	      context.setOutput(context.getOutput() + (9 * multiplo()));
	      context.setInput(context.getInput().substring(2));
	    }
	    else if (context.getInput().startsWith(cinco())) {
	      context.setOutput(context.getOutput() + (5 * multiplo()));
	      context.setInput(context.getInput().substring(1));
	    }
	    else if (context.getInput().startsWith(quatro())) {
	      context.setOutput(context.getOutput() + (4 * multiplo()));
	      context.setInput(context.getInput().substring(2));
	    }

	    while (context.getInput().startsWith(um())) {
	      context.setOutput(context.getOutput() + (1 * multiplo()));
	      context.setInput(context.getInput().substring(1));
	    }
	    
	}

	protected abstract String nove();
	
	protected abstract String cinco();
	
	protected abstract String quatro();
	
	protected abstract String um();
	
	protected abstract int multiplo();
	
}