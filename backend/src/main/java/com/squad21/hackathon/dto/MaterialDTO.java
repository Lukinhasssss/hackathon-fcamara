package com.squad21.hackathon.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.squad21.hackathon.entities.Material;
import com.squad21.hackathon.entities.Usuario;

public class MaterialDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nome;
	
	private List<UsuarioDTO> usuarios = new ArrayList<>();
	
	public MaterialDTO() {}

	public MaterialDTO(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public MaterialDTO(Material material) {
		id = material.getId();
		nome = material.getNome();
	}
	
	public MaterialDTO(Material material, List<Usuario> usuarios) {
		this(material);
		usuarios.forEach(usuario -> this.usuarios.add(new UsuarioDTO(usuario)));
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

	public List<UsuarioDTO> getUsuarios() {
		return usuarios;
	}

}
