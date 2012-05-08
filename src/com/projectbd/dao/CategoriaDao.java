package com.projectbd.dao;

/** 
 * @author Paulo Antonio
 * @author Renan Oliveira
 * **/
import java.util.List;

import com.projectbd.entity.Categoria;

public class CategoriaDao extends GenericDaoImpl<Categoria>{

	public CategoriaDao() {
		super(Categoria.class);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Categoria> findAll() {
		return getEntityManager().createQuery("SELECT cat FROM Categoria cat")
				.getResultList();
	}

	@Override
	public Categoria findByName(String name) {
		return (Categoria) getEntityManager().createQuery(
				"SELECT cat FROM Categoria cat WHERE cat.nome=" + "'"+name+"'").getSingleResult();
	}
	
}
