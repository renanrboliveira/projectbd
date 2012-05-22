package com.projectbd.dao.test;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.projectbd.dao.RepositoryException;
import com.projectbd.dao.UsuarioDao;
import com.projectbd.entity.Usuario;

public class UsuarioDaoTest {
	private UsuarioDao dao;
	private Usuario usuario;
	
	@Before
	public void setUp() throws Exception {
		usuario = new Usuario();
		dao = new UsuarioDao();
	}

	@Ignore
	public void testSave() throws RepositoryException{
		usuario.setNome("Paulo");
		usuario.setLogin("pauloneto");
		usuario.setSenha("231074");
		dao.save(usuario);
		
		Assert.assertEquals(dao.findByName("Paulo").getNome(),"Paulo");
	}
	
	@Ignore
	public void testUpdate()throws RepositoryException{
		usuario.setNome("Paulo");
		usuario.setLogin("pauloneto");
		usuario.setSenha("231074");
		dao.save(usuario);
		
		usuario.setSenha("894523");
		
		dao.update(usuario);
		
		Assert.assertTrue(dao.findId(1).getSenha().equals("894523"));
	}
	
	@Ignore
	public void testDelete()throws RepositoryException{
		usuario.setNome("Paulo");
		usuario.setLogin("pauloneto");
		usuario.setSenha("231074");
		dao.save(usuario);
		
		dao.delete(usuario);
		
		Assert.assertTrue(dao.findAll().size() == 0);
	}
	
	@Ignore
	public void testFindAll()throws RepositoryException {
		usuario.setNome("Paulo");
		usuario.setLogin("pauloneto");
		usuario.setSenha("231074");
		dao.save(usuario);
		
		Assert.assertTrue(dao.findAll().size() == 1);
	}
	
	@Ignore
	public void testFindByName()throws RepositoryException{
		usuario.setNome("Paulo");
		usuario.setLogin("pauloneto");
		usuario.setSenha("231074");
		dao.save(usuario);
		
		Assert.assertTrue(dao.findByName("Paulo").equals(usuario));
	}
	
	@Test
	public void testFindId()throws RepositoryException{
		usuario.setNome("Paulo");
		usuario.setLogin("pauloneto");
		usuario.setSenha("231074");
		dao.save(usuario);
		
		Assert.assertTrue(dao.findId(1).getSenha().equals("231074"));
	}
}
