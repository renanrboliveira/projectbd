package com.projectbd.dao.test;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import com.projectbd.dao.RepositoryException;
import com.projectbd.dao.UsuarioDao;
import com.projectbd.entity.Usuario;

public class UsuarioDaoTest {
	private UsuarioDao dao;
	private Usuario usuario;
	
	@Before
	public void setUp() throws Exception {
		dao = new UsuarioDao();
	}

	@Test(expected = RepositoryException.class)
	public void salveTest() throws RepositoryException{
		usuario = new Usuario();
		usuario.setNome("Paulo");
		usuario.setLogin("pauloneto");
		usuario.setSenha("231074");
		usuario.setId(1);
		dao.save(usuario);
		
		dao = new UsuarioDao();
		
		Assert.assertEquals(dao.findByName("Paulo").getNome(),"Paulo");
		
		dao = new UsuarioDao();
		
		Usuario usuario = dao.findByName("Paulo");
		dao.delete(usuario);
	}
	
	

}
