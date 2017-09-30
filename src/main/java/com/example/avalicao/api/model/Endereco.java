package com.example.avalicao.api.model;


import javax.persistence.Embeddable;

@Embeddable
public class Endereco {

	private String municipio;
	private String uf;
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	
	
	
}
