package br.service.br;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.model.Contact;
import br.service.dao.IContactService;

@Service
public class ContactBR implements IContactBR {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1298974631270223955L;
	@Autowired
	private IContactService service;

	@Override
	public Contact save(Contact t) {
		service.save(t);
		return t;
	}

	@Override
	public List<Contact> findAll() {
		return service.findAll();
	}
	
}
