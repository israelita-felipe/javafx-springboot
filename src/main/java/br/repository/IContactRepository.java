package br.repository;

import java.util.List;

import br.model.Contact;

/**
 * Date: 27.08.15 Time: 17:21
 *
 * @author Ruslan Molchanov (ruslanys@gmail.com)
 * @author http://mruslan.com
 */

public interface IContactRepository {

	List<Contact> findAll();

	Contact save(Contact contact);

}
