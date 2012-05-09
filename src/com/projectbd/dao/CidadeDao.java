package com.projectbd.dao;

import java.util.List;
import com.projectbd.entity.Cidade;

public class CidadeDao extends GenericDaoImpl<Cidade>{

	public CidadeDao() {
		super(Cidade.class);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Cidade> findAll() {
		return getEntityManager().createQuery("SELECT cid FROM Cidade cid")
				.getResultList();
	}

	@Override
	public Cidade findByName(String name) {
		return (Cidade) getEntityManager().createQuery("SELECT c FROM Cidade c  WHERE c.nome = ?1 ", Cidade.class)
				.setParameter(1, name).getResultList().get(0);
	}

}
