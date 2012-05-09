package com.projectbd.dao;

import java.util.List;

import com.projectbd.entity.Estado;

public class EstadoDao extends GenericDaoImpl<Estado>{

	public EstadoDao() {
		super(Estado.class);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Estado> findAll() {
		return getEntityManager().createQuery("SELECT est FROM Estado est").getResultList();
	}

	@Override
	public Estado findByName(String name) {
		return (Estado) getEntityManager().createQuery("SELECT e FROM Estado e  WHERE e.nome = ?1 ", Estado.class)
				.setParameter(1, name).getResultList().get(0);
	}

}
