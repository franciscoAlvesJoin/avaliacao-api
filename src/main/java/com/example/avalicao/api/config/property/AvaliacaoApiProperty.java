package com.example.avalicao.api.config.property;


import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("avaliacao")
public class AvaliacaoApiProperty {

	private String originPermitida = "http://localhost:4200";


	
	public void setOriginPermitida(String originPermitida) {
		this.originPermitida = originPermitida;
	}



	public String getOriginPermitida() {
		return originPermitida;
	}


	

}
