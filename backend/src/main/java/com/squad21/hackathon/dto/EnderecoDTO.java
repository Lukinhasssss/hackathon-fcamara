package com.squad21.hackathon.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.squad21.hackathon.entities.Cidade;
import com.squad21.hackathon.entities.Endereco;
import com.squad21.hackathon.entities.Escola;

public class EnderecoDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String logradouro;
	private Integer numero;
	private String bairro;
	private String cep;

	private Cidade cidade;
	
	@JsonIgnore
	private Escola escola;
	
	public EnderecoDTO() {}

	public EnderecoDTO(Long id, String logradouro, Integer numero, String bairro, String cep, Cidade cidade, Escola escola) {
		this.id = id;
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.escola = escola;
	}
	
	public EnderecoDTO(Endereco endereco) {
		id = endereco.getId();
		logradouro = endereco.getLogradouro();
		numero = endereco.getNumero();
		bairro = endereco.getBairro();
		cep = endereco.getCep();
		cidade = endereco.getCidade();
		escola = endereco.getEscola();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Escola getEscola() {
		return escola;
	}

	public void setEscola(Escola escola) {
		this.escola = escola;
	}

}
