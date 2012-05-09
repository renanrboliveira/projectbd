package com.projectbd.dao;

import java.util.List;
import com.projectbd.entity.Cliente;

/**
 * @author Paulo Antonio
 * @author Renan Oliveira 
 * **/
public class ClienteDao extends GenericDaoImpl<Cliente> {

	public ClienteDao() {
		super(Cliente.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Cliente> findAll() {
		return getEntityManager().createQuery("SELECT c FROM Cliente c")
				.getResultList();
	}

	@Override
	public Cliente findByName(String name) {

		return (Cliente) getEntityManager().createQuery(
				"SELECT c FROM Cliente c  WHERE c.nome = ?1 ", Cliente.class)
				.setParameter(1, name).getResultList().get(0);
	}

}
