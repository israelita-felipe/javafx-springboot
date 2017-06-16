package br;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.control.ContactCreateController;
import br.control.IController;
import br.control.MainController;
import br.control.View;
import javafx.fxml.FXMLLoader;

/**
 * Date: 27.08.15 Time: 11:04
 *
 * @author Ruslan Molchanov (ruslanys@gmail.com)
 * @author http://mruslan.com
 * @author Israel Araújo (israelita.felipe@gmail.com) B.Sc. Federal Rural
 *         University of Pernambuco - UAG, M.Sc. Federal University of
 *         Pernambuco - CIn
 */
@Configuration
public class ConfigurationControllers {

	@Bean(name = "mainView")
	public View<MainController> getMainView() throws IOException {
		return this.<MainController>loadView("view/main.fxml");
	}

	@Bean
	public MainController getMainController() throws IOException {
		return getMainView().getController();
	}

	@Bean(name = "contactCreateView")
	public View<ContactCreateController> getContactCreateView() throws IOException {
		return this.<ContactCreateController>loadView("view/contact/Create.fxml");
	}

	@Bean
	public ContactCreateController getContactCreateController() throws IOException {
		return getContactCreateView().getController();
	}

	protected <T extends IController> View<T> loadView(String url) throws IOException {
		InputStream fxmlStream = null;
		try {
			fxmlStream = getClass().getClassLoader().getResourceAsStream(url);
			FXMLLoader loader = new FXMLLoader();
			loader.load(fxmlStream);
			return new View<T>(loader.getRoot(), loader.getController());
		} finally {
			if (fxmlStream != null) {
				fxmlStream.close();
			}
		}
	}

}
