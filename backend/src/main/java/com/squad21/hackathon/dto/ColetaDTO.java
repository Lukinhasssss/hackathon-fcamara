package com.squad21.hackathon.dto;

import java.io.Serializable;

import com.squad21.hackathon.entities.Coleta;

public class ColetaDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nome;
	private String logradouro;
	private Integer numero;
	private String bairro;
	private String cep;
	private String cidade;
	private String estado;
	
	public ColetaDTO() {}

	public ColetaDTO(Long id, String nome, String logradouro, Integer numero, String bairro, String cep, String cidade, String estado) {
		this.id = id;
		this.nome = nome;
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	public ColetaDTO(Coleta coleta) {
		id = coleta.getId();
		nome = coleta.getNome();
		logradouro = coleta.getLogradouro();
		numero = coleta.getNumero();
		bairro = coleta.getBairro();
		cep = coleta.getCep();
		cidade = coleta.getCidade();
		estado = coleta.getEstado();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
	
	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
