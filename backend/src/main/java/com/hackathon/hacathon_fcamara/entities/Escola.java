package com.hackathon.hacathon_fcamara.entities;

import java.io.Serializable;

public class Escola implements Serializable{
	private static final long serialVersionUID = 1L;
	private Long id;
	private String nome;
	private String cnpj;
	private String telefone;
	private Endereco endereco;
	private Cidade cidade;
	private Estado estado;
	
	public Escola() {}
	
	public Escola(Long id, String nome, String cnpj, String telefone,
			Estado estado,Cidade cidade,Endereco endereco) {
		this.id = id;
		this.nome = nome;
		this.cnpj = cnpj;
		this.telefone = telefone;
		estado=new Estado();
		cidade=new Cidade();
		endereco=new Endereco();
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
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
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
		Escola other = (Escola) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	}