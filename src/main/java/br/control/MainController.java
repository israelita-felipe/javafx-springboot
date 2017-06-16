package br.control;

import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javafx.scene.Scene;

/**
 * Date: 27.08.15 Time: 11:10
 *
 * @author Ruslan Molchanov (ruslanys@gmail.com)
 * @author http://mruslan.com
 * @author Israel Araújo (israelita.felipe@gmail.com) B.Sc. Federal Rural
 *         University of Pernambuco - UAG, M.Sc. Federal University of
 *         Pernambuco - CIn
 */
public class MainController extends Controller {

	@Qualifier("contactCreateView")
	@Autowired
	private View<ContactCreateController> view;

	public void handleShowContactCreate() {
		getStage().setScene(new Scene(view.getView()));
		getStage().setResizable(true);
		getStage().centerOnScreen();
		getStage().show();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}
}
