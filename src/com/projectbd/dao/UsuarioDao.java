package com.projectbd.dao;

import java.util.List;
import com.projectbd.entity.Usuario;

public class UsuarioDao extends GenericDaoImpl<Usuario>{
	public UsuarioDao(){
		super(Usuario.class);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Usuario> findAll() {
		return getEntityManager().createQuery("SELECT u FROM Usuario u").getResultList();
	}

	@Override
	public Usuario findByName(String name) {
		// TODO Auto-generated method stub
		return (Usuario) getEntityManager().createQuery("SELECT u FROM Usuario u WHERE u.nome = ?1 ", Usuario.class)
				.setParameter(1, name).getResultList().get(0);
	}
	
	
}
