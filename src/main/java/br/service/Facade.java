package br.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.model.Contact;
import br.service.br.ContactBR;

/**
 * @author Israel Araújo (israelita.felipe@gmail.com) B.Sc. Federal Rural
 *         University of Pernambuco - UAG, M.Sc. Federal University of
 *         Pernambuco - CIn
 *
 */
@Service
public class Facade implements IFacade {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2054819484248340153L;
	@Autowired
	private ContactBR contactBR;

	@Override
	public Contact contactSave(Contact t) {
		return contactBR.save(t);
	}

	@Override
	public List<Contact> contactFindAll() {
		return contactBR.findAll();
	}

}
