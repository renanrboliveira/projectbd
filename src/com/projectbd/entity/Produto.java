package com.projectbd.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Produto
 *
 */
@Entity
public class Produto implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column
	private String nome;
	
	@Column
	private String observacao;
	
	@ManyToOne
	@JoinColumn(name = "categoria_id")
	private Categoria categoria;
	
	@ManyToOne
	@JoinColumn(name = "estoque_id")
	private Estoque estoque;
	
	@ManyToMany
	@JoinTable(name = "Produto_Fornecedor",
		joinColumns=@JoinColumn(name = "produto_id"),
		inverseJoinColumns=@JoinColumn(name = "fornecedor_id"))
	private Collection<Fornecedor> fornecedores;

	public Produto() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Estoque getEstoque() {
		return estoque;
	}

	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public Collection<Fornecedor> getFornecedores(){
		return fornecedores;
	}
	
	
   
}
