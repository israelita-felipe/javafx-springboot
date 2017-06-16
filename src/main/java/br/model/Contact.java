package br.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import javafx.beans.property.LongProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Класс, аналогичный классу {@link Contact} за тем исключением, что поля из
 * себя представляют JavaFX Property. Это может пригодиться.
 *
 * JPA с ним работает аналогично классу {@link Contact}.
 */

@XmlRootElement
public class Contact implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7597923918166653999L;

	private static long sequence = 1L;

	@XmlElement
	private LongProperty id = new SimpleLongProperty();

	@XmlElement
	private StringProperty name = new SimpleStringProperty();

	@XmlElement
	private StringProperty phone = new SimpleStringProperty();

	@XmlElement
	private StringProperty email = new SimpleStringProperty();

	public Contact() {
	}

	public Contact(String name, String phone, String email) {
		setId(sequence++);
		setName(name);
		setPhone(phone);
		setEmail(email);
	}

	public Long getId() {
		return id.get();
	}

	public LongProperty idProperty() {
		return id;
	}

	public void setId(Long id) {
		this.id.set(id);
	}

	public String getName() {
		return name.get();
	}

	public StringProperty nameProperty() {
		return name;
	}

	public void setName(String name) {
		this.name.set(name);
	}

	public String getPhone() {
		return phone.get();
	}

	public StringProperty phoneProperty() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone.set(phone);
	}

	public String getEmail() {
		return email.get();
	}

	public StringProperty emailProperty() {
		return email;
	}

	public void setEmail(String email) {
		this.email.set(email);
	}
}
