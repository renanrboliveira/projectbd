package com.projectbd.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * Entity implementation class for Entity: Cliente
 *@author Paulo Antonio
 *@author Renan Oliveira
 */
@Entity
public class Cliente implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column
	private String nome;
	
	@Column
	private String telefone;
	
	@Column
	private String celular;
	
	@Column
	private String email;
	
	@Column
	private String sexo;
	
	@Column
	private String rg;
	
	@Column
	private String cnpjCpf;
	
	@OneToOne
	@JoinColumn(name="endereco_id")
	private Endereco endereco;
	
	public Cliente() {
		super();
	}
	
	
	public String getTelefone() {
		return telefone;
	}



	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}



	public String getCelular() {
		return celular;
	}



	public void setCelular(String celular) {
		this.celular = celular;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getSexo() {
		return sexo;
	}



	public void setSexo(String sexo) {
		this.sexo = sexo;
	}



	public String getRg() {
		return rg;
	}



	public void setRg(String rg) {
		this.rg = rg;
	}



	public String getCnpjCpf() {
		return cnpjCpf;
	}



	public void setCnpjCpf(String cnpjCpf) {
		this.cnpjCpf = cnpjCpf;
	}



	public Endereco getEndereco() {
		return endereco;
	}



	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	
   
}
