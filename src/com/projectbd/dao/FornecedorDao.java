package com.projectbd.dao;

import java.util.List;
import com.projectbd.entity.Fornecedor;

public class FornecedorDao extends GenericDaoImpl<Fornecedor>{

	public FornecedorDao() {
		super(Fornecedor.class);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Fornecedor> findAll() {
		return getEntityManager().createQuery("SELECT forn FROM Fornecedor forn").getResultList();
	}

	@Override
	public Fornecedor findByName(String name) {
		return (Fornecedor) getEntityManager().createQuery("SELECT forn FROM Fornecedor forn  WHERE forn.nome = ? ", Fornecedor.class)
				.setParameter(1, name).getResultList().get(0);
	}

}
