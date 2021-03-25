package com.squad21.hackathon.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_livraria")
public class Livraria implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String cnpj;
	private String telefone;
	
	@ManyToMany
	@JoinTable(name = "tb_livraria_endereco",
		joinColumns = @JoinColumn(name = "livraria_id"),
		inverseJoinColumns = @JoinColumn(name = "endereco_id")
	)
	private List<Endereco> enderecos = new ArrayList<>();
	
	@ManyToMany(mappedBy = "livrarias")
	private List<Escola> escolas = new ArrayList<>();
	
	@ManyToMany
	@JoinTable(name = "tb_livraria_material",
		joinColumns = @JoinColumn(name = "livraria_id"),
		inverseJoinColumns = @JoinColumn(name = "material_id")
	)
	private List<Material> materiais = new ArrayList<>();
	
	public Livraria() {}
	
	public Livraria(Long id, String nome, String cnpj, String telefone) {
		this.id = id;
		this.nome = nome;
		this.cnpj = cnpj;
		this.telefone = telefone;
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
		Livraria other = (Livraria) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
