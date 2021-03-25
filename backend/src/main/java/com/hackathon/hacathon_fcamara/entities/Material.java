package com.hackathon.hacathon_fcamara.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Material implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nome;
	
	private List<Usuario> usuarios = new ArrayList<>();
	private List<Livraria> livrarias = new ArrayList<>();
	
	public Material() {}
	
	public Material(Long id, String nome) {
		this.id = id;
		this.nome = nome;
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
	
	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public List<Livraria> getLivrarias() {
		return livrarias;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Material other = (Material) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
