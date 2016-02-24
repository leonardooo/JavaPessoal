package br.gov.serpro.escola.model;

import java.util.Date;

public class Aluno extends Entity {

	private String nome;

	private Matricula matricula;

	private Date dataNascimento;

	public Aluno() {
	}

	public Aluno(String nome, Matricula matricula,
			Date dataNascimento) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Matricula getMatricula() {
		return matricula;
	}

	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
