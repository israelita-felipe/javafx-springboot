package br;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javafx.application.Application;

/**
 * * @author Ruslan Molchanov (ruslanys@gmail.com)
 * 
 * @author http://mruslan.com
 * @author Israel Araújo (israelita.felipe@gmail.com) B.Sc. Federal Rural
 *         University of Pernambuco - UAG, M.Sc. Federal University of
 *         Pernambuco - CIn
 */
public abstract class AbstractJavaFxApplicationSupport extends Application {

	private static String[] savedArgs;

	protected ConfigurableApplicationContext context;

	@Override
	public void init() throws Exception {
		context = SpringApplication.run(getClass(), savedArgs);
		context.getAutowireCapableBeanFactory().autowireBean(this);
	}

	@Override
	public void stop() throws Exception {
		super.stop();
		context.close();
	}

	protected static void launchApp(Class<? extends AbstractJavaFxApplicationSupport> appClass, String[] args) {
		AbstractJavaFxApplicationSupport.savedArgs = args;
		Application.launch(appClass, args);
	}
}
