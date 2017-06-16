package br;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Lazy;

import br.control.MainController;
import br.control.View;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author Ruslan Molchanov (ruslanys@gmail.com)
 * @author http://mruslan.com
 * @author Israel Araújo (israelita.felipe@gmail.com) B.Sc. Federal Rural
 *         University of Pernambuco - UAG, M.Sc. Federal University of
 *         Pernambuco - CIn
 */
@Lazy
@SpringBootApplication
public class Application extends AbstractJavaFxApplicationSupport {

	@Value("${ui.title:JavaFX and Spring}") //
	private String windowTitle;

	@Qualifier("mainView")
	@Autowired
	private View<MainController> view;

	@Override
	public void start(Stage stage) throws Exception {
		view.getController().setStage(stage);
		stage.setTitle(windowTitle);
		stage.setScene(new Scene(view.getView()));
		stage.setResizable(true);
		stage.centerOnScreen();
		stage.show();
	}

	public static void main(String[] args) {
		launchApp(Application.class, args);
	}

}
