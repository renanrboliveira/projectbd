package com.projectbd.dao.test;
/**
 * @author Paulo Neto
 * @author Renan Oliveira
 * */
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.projectbd.dao.EstadoDao;
import com.projectbd.dao.RepositoryException;
import com.projectbd.entity.Estado;

public class EstadoDaoTest {

	private Estado estado;
	private Estado estado02;
	private EstadoDao estadoDao;

	@Before
	public void setUp() throws Exception {
		estado = new Estado();
		estado02 = new Estado();
		estadoDao = new EstadoDao();
	}

	@Ignore
	public void testSave() throws RepositoryException {
		estado.setNome("BA");
		estadoDao.save(estado);

		Assert.assertEquals(estadoDao.findByName("BA").getNome(), "BA");

	}

	@Ignore
	public void testUpdate() throws RepositoryException {
		estado.setNome("BA");
		estadoDao.save(estado);
		
		estado.setNome("PB");
		estadoDao.update(estado);
		
		Assert.assertEquals(estadoDao.findId(1).getNome(),"PB");
	}
	
	@Ignore
	public void testDelete()throws RepositoryException{
		estado.setNome("RJ");
		estado02.setNome("SP");
		
		estadoDao.save(estado);
		estadoDao.save(estado02);
		
		estadoDao.delete(estado);
		
		Assert.assertFalse(estadoDao.findAll().contains(estado));
	}
	
	@Ignore
	public void testFindAll()throws RepositoryException{
		estado.setNome("RJ");
		estado02.setNome("SP");
		
		estadoDao.save(estado);
		estadoDao.save(estado02);
		
		Assert.assertTrue(estadoDao.findAll().size() == 2);
		
	}
	
	@Ignore
	public void testFindId()throws RepositoryException{
		estado.setNome("RJ");
		estado02.setNome("SP");
		
		estadoDao.save(estado);
		estadoDao.save(estado02);
		
		Assert.assertTrue(estadoDao.findId(2).getNome().equals("SP"));
	}
	
	@Test
	public void testFindByName()throws RepositoryException{
		estado.setNome("RJ");
		estado02.setNome("SP");
		
		estadoDao.save(estado);
		estadoDao.save(estado02);
		
		Assert.assertTrue(estadoDao.findByName("RJ").getId() == 1);
	}

}
