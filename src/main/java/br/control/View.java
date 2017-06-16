package br.control;

import javafx.scene.Parent;

public class View<T extends IController> {
	private Parent view;
	private T controller;

	public View(Parent view, T controller) {
		this.view = view;
		this.controller = controller;
	}

	public Parent getView() {
		return view;
	}

	public void setView(Parent view) {
		this.view = view;
	}

	public T getController() {
		return controller;
	}

	public void setController(T controller) {
		this.controller = controller;
	}
}
