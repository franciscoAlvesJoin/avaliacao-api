package com.example.avalicao.api.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "pessoa")
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	@NotNull
	@Column(name = "nome_razao")
	private String nome;
	
	@Column(name = "dt_nasc_fundacao")
	private LocalDate dataNascFund;
	
	@Column(name = "tipo_pessoa")
	@NotNull
	@Enumerated(EnumType.STRING)
	private TipoPessoa tipo;
	
	@Column(name = "rg")
	private String rg;
	
	@Column(name = "cpf_cnpj")
	@NotNull
	private String cpfCnpj;

	@Embedded
	private Endereco endereco;


	public Long getCodigo() {
		return codigo;
	}


	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	


	public String getCpfCnpj() {
		return cpfCnpj;
	}


	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}


	public LocalDate getDataNascFund() {
		return dataNascFund;
	}


	public void setDataNascFund(LocalDate dataNascFund) {
		this.dataNascFund = dataNascFund;
	}


	public TipoPessoa getTipo() {
		return tipo;
	}


	public void setTipo(TipoPessoa tipo) {
		this.tipo = tipo;
	}


	


	public String getRg() {
		return rg;
	}


	public void setRg(String rg) {
		this.rg = rg;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	
		
}
