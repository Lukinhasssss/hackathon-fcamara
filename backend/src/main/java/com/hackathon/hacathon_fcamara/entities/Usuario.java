package com.hackathon.hacathon_fcamara.entities;

import java.io.Serializable;

public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String nome;
	private String telefone;
	private Endereco endereco;
	private Cidade cidade;
	private Estado estado;
	
	public Usuario() {}
	
	public Usuario(Long id, String nome, String telefone,Endereco endereco
			,Cidade cidade, Estado estado) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		endereco=new Endereco();
		cidade=new Cidade();
		estado=new Estado();
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

	public Estado getEstado() {
		return estado;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public Endereco getEndereco() {
		return endereco;
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
