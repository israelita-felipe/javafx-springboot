package br.service.dao;

import java.util.List;

import br.model.Contact;

/**
 * Date: 27.08.15 Time: 17:22
 *
 * @author Ruslan Molchanov (ruslanys@gmail.com)
 * @author http://mruslan.com
 */
public interface IContactService {

	Contact save(Contact contact);

	List<Contact> findAll();

}
