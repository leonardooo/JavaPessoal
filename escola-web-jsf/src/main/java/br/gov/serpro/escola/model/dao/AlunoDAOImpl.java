package br.gov.serpro.escola.model.dao;

import java.util.Date;

import br.gov.serpro.escola.model.Aluno;
import br.gov.serpro.escola.model.Matricula;

public class AlunoDAOImpl extends EntityDAOImpl<Aluno> implements AlunoDAO {

	private static AlunoDAOImpl instance =
			new AlunoDAOImpl();
	
	public static AlunoDAOImpl getInstance() {
		return instance;
	}

	private AlunoDAOImpl() {
		insert(new Aluno("Ana Elizabeth", new Matricula(1,1), new Date()));
		insert(new Aluno("Erison Galvao", new Matricula(2,2), new Date()));
		insert(new Aluno("Flavio Amorim", new Matricula(3,3), new Date()));
		insert(new Aluno("Himir Neves", new Matricula(4,4), new Date()));
		insert(new Aluno("Leonardo Assis", new Matricula(5,5), new Date()));
		insert(new Aluno("Chico Bento", new Matricula(6,6), new Date()));
		insert(new Aluno("Marcos Jose", new Matricula(7,7), new Date()));
		insert(new Aluno("Milena Souza", new Matricula(8,8), new Date()));
		insert(new Aluno("Rudnaldo Lima", new Matricula(9,9), new Date()));
		insert(new Aluno("Euclipse", new Matricula(10,10), new Date()));
	}

}
