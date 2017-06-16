package br.service.dao;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.model.Contact;
import br.repository.IContactRepository;

/**
 * @author Ruslan Molchanov (ruslanys@gmail.com)
 * @author http://mruslan.com
 * @author Israel Araújo (israelita.felipe@gmail.com) B.Sc. Federal Rural
 *         University of Pernambuco - UAG, M.Sc. Federal University of
 *         Pernambuco - CIn
 */
@Service
public class ContactService implements IContactService {

	@Autowired
	private IContactRepository repository;

	@PostConstruct
	public void generateTestData() {
		save(new Contact("Contact one", "+123456789", "contact@one"));
		save(new Contact("Contact two", "+987654321", "contact@two"));
	}

	@Override
	public Contact save(Contact contact) {
		return repository.save(contact);
	}

	@Override
	public List<Contact> findAll() {
		return repository.findAll();
	}
}
