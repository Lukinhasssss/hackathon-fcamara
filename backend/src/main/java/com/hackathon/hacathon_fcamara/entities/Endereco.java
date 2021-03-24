package com.hackathon.hacathon_fcamara.entities;

import java.io.Serializable;

public class Endereco implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String logradoura;
	private Integer numero;
	private String bairro;
	private String cep;
	
	public Endereco() {}
	
	public Endereco(Long id, String lougadoura,Integer numero,
			String bairro,String cep) {
		this.id = id;
		this.logradoura=logradoura;
		this.numero=numero;
		this.bairro=bairro;
		this.cep=cep;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogradoura() {
		return logradoura;
	}

	public void setLogradoura(String logradoura) {
		this.logradoura = logradoura;
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
		Endereco other = (Endereco) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


   

}
