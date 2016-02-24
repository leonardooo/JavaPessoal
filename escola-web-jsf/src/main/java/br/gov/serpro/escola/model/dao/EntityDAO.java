package br.gov.serpro.escola.model.dao;

import java.util.List;

import br.gov.serpro.escola.model.Entity;

public interface EntityDAO<T extends Entity> {
	
	List<T> list();
	
	T findById(Integer id);
	
	Integer insert(T t);
	
	void update(T t);
	
	void delete(T t);

}
