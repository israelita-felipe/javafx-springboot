package br.control;

import br.service.IFacade;
import javafx.fxml.Initializable;
import javafx.stage.Stage;

public interface IController extends Initializable {

	IFacade getFacade();

	Stage getStage();

	void setStage(Stage stage);
}
