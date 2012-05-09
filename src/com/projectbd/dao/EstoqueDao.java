package com.projectbd.dao;

import java.util.List;

import com.projectbd.entity.Estoque;

public class EstoqueDao extends GenericDaoImpl<Estoque>{

	public EstoqueDao() {
		super(Estoque.class);
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Estoque> findAll() {
		return getEntityManager().createQuery("SELECT e FROM Estoque e").getResultList();
	}

	@Override
	public Estoque findByName(String name) {
		return (Estoque) getEntityManager()
				.createQuery("SELECT e FROM Estoque e WHERE e.nome = ?1 ", Estoque.class)
				.setParameter(1, name).getResultList().get(0);
	}
	
	

}
