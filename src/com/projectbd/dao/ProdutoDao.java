package com.projectbd.dao;

import java.util.List;

import com.projectbd.entity.Produto;

public class ProdutoDao extends GenericDaoImpl<Produto>{
	public ProdutoDao(){
		super(Produto.class);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Produto> findAll() {
		return getEntityManager().createQuery("SELECT p FROM Produto p").getResultList();
	}

	@Override
	public Produto findByName(String name) {
		return getEntityManager().createQuery("SELECT p FROM Produto p WHERE p.nome = ?1 ", Produto.class)
				.setParameter(1, name).getResultList().get(0);
	}
	
}
