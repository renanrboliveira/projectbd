package com.projectbd.dao;

import java.util.List;

import com.projectbd.entity.Endereco;

public class EnderecoDao extends GenericDaoImpl<Endereco> {

	public EnderecoDao() {
		super(Endereco.class);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Endereco> findAll() {
		return getEntityManager().createQuery("SELECT end FROM Endereco end").getResultList();
	}

	@Override
	public Endereco findByName(String cep) {
		return (Endereco) getEntityManager()
				.createQuery("SELECT e FROM Endereco e WHERE e.cep = ?1 ", Endereco.class)
				.setParameter(1, cep).getResultList().get(0);
	}

}
