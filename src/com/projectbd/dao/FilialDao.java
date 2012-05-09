package com.projectbd.dao;

import java.util.List;
import com.projectbd.entity.Filial;

public class FilialDao extends GenericDaoImpl<Filial> {

	public FilialDao() {
		super(Filial.class);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Filial> findAll() {
		return getEntityManager().createQuery("SELECT f FROM Filial f").getResultList();
	}

	@Override
	public Filial findByName(String name){
		return (Filial) getEntityManager().createQuery("SELECT f FROM Filial f  WHERE f.nome = ?1 ", Filial.class)
				.setParameter(1, name).getResultList().get(0);
	}

}
