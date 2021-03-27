package com.squad21.hackathon.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.squad21.hackathon.entities.Cidade;
import com.squad21.hackathon.entities.Estado;

public class EstadoDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nome;
	
	@JsonIgnore
	private List<CidadeDTO> cidades = new ArrayList<>();
	
	public EstadoDTO() {}

	public EstadoDTO(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public EstadoDTO(Estado estado) {
		id = estado.getId();
		nome = estado.getNome();
	}
	
	public EstadoDTO(Estado estado, List<Cidade> cidades) {
		this(estado);
		cidades.forEach(cidade -> this.cidades.add(new CidadeDTO(cidade)));
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

	public List<CidadeDTO> getCidades() {
		return cidades;
	}
	
}
