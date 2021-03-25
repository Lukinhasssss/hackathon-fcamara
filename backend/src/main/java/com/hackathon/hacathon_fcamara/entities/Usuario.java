package com.hackathon.hacathon_fcamara.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Usuario implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nome;
	private String telefone;
	
	private Escola escola;
	
	private List<Material> materiais = new ArrayList<>();
	
	public Usuario() {}
	
	public Usuario(Long id, String nome, String telefone, Escola escola) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.escola = escola;
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
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public Escola getEscola() {
		return escola;
	}
	
	public void setEscola(Escola escola) {
		this.escola = escola;
	}
	
	public List<Material> getMateriais() {
		return materiais;
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
		Usuario other = (Usuario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
