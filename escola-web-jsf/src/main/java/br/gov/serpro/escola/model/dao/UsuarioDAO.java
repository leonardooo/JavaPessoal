package br.gov.serpro.escola.model.dao;

import br.gov.serpro.escola.model.Usuario;

public interface UsuarioDAO {
	
	Usuario findByLogin(String login);

}
