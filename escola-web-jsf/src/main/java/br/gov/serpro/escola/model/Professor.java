package br.gov.serpro.escola.model;

import java.util.Date;

public class Professor extends Entity {
	
	private String nome;
	
	private Date dataNascimento;
	
	private String titulacao;
	
	public Professor() {}

	public Professor(String nome, Date dataNascimento, String titulacao) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.titulacao = titulacao;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	
}
