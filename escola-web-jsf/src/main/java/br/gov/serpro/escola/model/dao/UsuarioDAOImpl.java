package br.gov.serpro.escola.model.dao;

import java.util.HashMap;
import java.util.Map;

import br.gov.serpro.escola.model.Usuario;

public class UsuarioDAOImpl implements UsuarioDAO {

	private static UsuarioDAOImpl instance = new UsuarioDAOImpl();

	public static UsuarioDAOImpl getInstance() {
		return instance;
	}

	private UsuarioDAOImpl() {
		map.put("admin", new Usuario("admin", "123", "Admin"));
	}

	public Usuario findByLogin(String login) {
		return map.get(login);
	}

	private Map<String, Usuario> map
		= new HashMap<String, Usuario>();

}
