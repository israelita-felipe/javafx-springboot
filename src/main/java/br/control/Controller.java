package br.control;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import br.service.IFacade;
import javafx.stage.Stage;

public abstract class Controller implements IController {
	
	protected Logger logger = LoggerFactory.getLogger(Controller.class);
	private Stage stage;
	
	@Autowired
	private IFacade facade;

	@Override
	public IFacade getFacade() {
		return this.facade;
	}

	@Override
	public Stage getStage() {
		return stage;
	}

	@Override
	public void setStage(Stage stage) {
		this.stage = stage;
	}

}
