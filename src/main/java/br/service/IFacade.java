package br.service;

import java.util.List;

import br.model.Contact;

public interface IFacade {

	List<Contact> contactFindAll();
	
	Contact contactSave(Contact t);
}
