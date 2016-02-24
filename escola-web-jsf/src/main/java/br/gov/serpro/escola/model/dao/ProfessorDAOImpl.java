package br.gov.serpro.escola.model.dao;

import java.util.Date;

import br.gov.serpro.escola.model.Professor;

public class ProfessorDAOImpl extends
		EntityDAOImpl<Professor> implements ProfessorDAO {

	private static ProfessorDAO instance = new ProfessorDAOImpl();
	
	private ProfessorDAOImpl() {
		insert(new Professor("Leonardo de Assis", new Date(), "Mestre"));
		insert(new Professor("José Leandro de Assis", new Date(), "Especialista"));
		insert(new Professor("Emmanuelle Rodrigues Araújo", new Date(), "Doutora"));
		insert(new Professor("Ludmila Arruda de Assis", new Date(), "Mestre"));
	}
	
	public static ProfessorDAO getInstance() {
		return instance;
	}
	
}
