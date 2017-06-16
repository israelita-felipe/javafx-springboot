package br.service.br;

import java.io.Serializable;
import java.util.List;

public interface IBR<T extends Serializable> extends Serializable {

	T save(T t);
	
	List<T> findAll();
}
