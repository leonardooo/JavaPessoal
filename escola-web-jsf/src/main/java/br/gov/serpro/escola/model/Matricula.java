package br.gov.serpro.escola.model;

public class Matricula {
	
	private Integer numero, digito;

	public Matricula() {}
	
	public Matricula(Integer numero, Integer digito) {
		this.numero = numero;
		this.digito = digito;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getDigito() {
		return digito;
	}

	public void setDigito(Integer digito) {
		this.digito = digito;
	}

}
