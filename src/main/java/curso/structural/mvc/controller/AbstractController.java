package curso.structural.mvc.controller;

import curso.structural.mvc.model.AbstractModel;
import curso.structural.mvc.view.AbstractView;

public abstract class AbstractController {

	public abstract void init(AbstractModel model, AbstractView view);
	
}
