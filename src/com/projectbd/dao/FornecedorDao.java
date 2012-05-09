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
		return getEntityManager().createQuery("SELECT f FROM f").getResultList();
	}

	@Override
	public Fornecedor findByName(String name) {
		return (Fornecedor) getEntityManager().createQuery("SELECT f FROM Fornecedor f  WHERE f.nome = ?1 ", Fornecedor.class)
				.setParameter(1, name).getResultList().get(0);
	}

}
