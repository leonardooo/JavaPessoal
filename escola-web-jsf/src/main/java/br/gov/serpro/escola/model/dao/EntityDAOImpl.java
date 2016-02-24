package br.gov.serpro.escola.model.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.gov.serpro.escola.model.Entity;

public abstract class EntityDAOImpl<T extends Entity>
		implements EntityDAO<T> {

	public List<T> list() {
		return new ArrayList<T>(map.values());
	}

	public T findById(Integer id) {
		return map.get(id);
	}

	public Integer insert(T t) {

		Integer id = nextId++;
		t.setId(id);
		map.put(id, t);
		return id;
	}

	public void update(T t) {
		map.put(t.getId(), t);
	}

	public void delete(T t) {
		map.remove(t.getId());
	}

	private Integer nextId = 0;

	private Map<Integer, T> map = new HashMap<Integer, T>();

}
