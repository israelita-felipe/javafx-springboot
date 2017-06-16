package br.repository;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.model.Contact;

@Service
public class ContactRepository implements IContactRepository {

	private List<Contact> list = new LinkedList<>();

	@Override
	public List<Contact> findAll() {
		return list;
	}

	@Override
	public Contact save(Contact contact) {
		list.add(contact);
		return contact;
	}

}
