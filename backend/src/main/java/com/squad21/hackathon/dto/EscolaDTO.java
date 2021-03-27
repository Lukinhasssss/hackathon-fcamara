package com.squad21.hackathon.dto;

import java.io.Serializable;

import com.squad21.hackathon.entities.Endereco;
import com.squad21.hackathon.entities.Escola;

public class EscolaDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nome;
	private String cnpj;
	private String telefone;
	
	private Endereco endereco;
	
	public EscolaDTO() {}

	public EscolaDTO(Long id, String nome, String cnpj, String telefone, Endereco endereco) {
		this.id = id;
		this.nome = nome;
		this.cnpj = cnpj;
		this.telefone = telefone;
		this.endereco = endereco;
	}
	
	public EscolaDTO(Escola escola) {
		id = escola.getId();
		nome = escola.getNome();
		cnpj = escola.getCnpj();
		telefone = escola.getTelefone();
		endereco = escola.getEndereco();
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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
