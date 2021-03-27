package com.squad21.hackathon.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.squad21.hackathon.entities.Escola;
import com.squad21.hackathon.entities.Material;
import com.squad21.hackathon.entities.Usuario;

public class UsuarioDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nome;
	private String telefone;
	
	private Escola escola;
	
	private List<MaterialDTO> materiais = new ArrayList<>();
	
	public UsuarioDTO() {}

	public UsuarioDTO(Long id, String nome, String telefone, Escola escola) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.escola = escola;
	}
	
	public UsuarioDTO(Usuario usuario) {
		id = usuario.getId();
		nome = usuario.getNome();
		telefone = usuario.getTelefone();
		escola = usuario.getEscola();
	}
	
	public UsuarioDTO(Usuario usuario, List<Material> materiais) {
		this(usuario);
		materiais.forEach(material -> this.materiais.add(new MaterialDTO(material)));
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

	public List<MaterialDTO> getMateriais() {
		return materiais;
	}

}
