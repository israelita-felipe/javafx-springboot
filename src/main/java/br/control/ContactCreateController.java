package br.control;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;

import br.model.Contact;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class ContactCreateController extends Controller {

	@FXML
	private TableView<Contact> table;
	@FXML
	private TextField txtName;
	@FXML
	private TextField txtPhone;
	@FXML
	private TextField txtEmail;

	private ObservableList<Contact> data;

	@PostConstruct
	public void init() {
		List<Contact> contacts = getFacade().contactFindAll();
		data = FXCollections.observableArrayList(contacts);

		TableColumn<Contact, String> idColumn = new TableColumn<>("ID");
		idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));

		TableColumn<Contact, String> nameColumn = new TableColumn<>("Name");
		nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

		TableColumn<Contact, String> phoneColumn = new TableColumn<>("Phone");
		phoneColumn.setCellValueFactory(new PropertyValueFactory<>("phone"));

		TableColumn<Contact, String> emailColumn = new TableColumn<>("E-mail");
		emailColumn.setCellValueFactory(new PropertyValueFactory<>("email"));

		table.getColumns().setAll(idColumn, nameColumn, phoneColumn, emailColumn);
		table.setItems(data);
	}

	@FXML
	public void addContact() {
		Contact contact = new Contact(txtName.getText(), txtPhone.getText(), txtEmail.getText());
		getFacade().contactSave(contact);
		data.add(contact);

		txtName.setText("");
		txtPhone.setText("");
		txtEmail.setText("");
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

}
