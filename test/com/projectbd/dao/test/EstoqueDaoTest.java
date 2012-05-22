package com.projectbd.dao.test;


import junit.framework.Assert;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.projectbd.dao.EstoqueDao;
import com.projectbd.dao.RepositoryException;
import com.projectbd.entity.Estoque;

public class EstoqueDaoTest {
	private Estoque estoque;
	private Estoque estoque02;
	private EstoqueDao estoqueDao;
	

	@Before
	public void setUp() throws Exception {
		estoque = new Estoque();
		estoque02 = new Estoque();
		estoqueDao = new EstoqueDao();

	}

	@Ignore
	public void testSave()throws RepositoryException {

		estoque.setNome("Estoque-bebidas");
		estoqueDao.save(estoque);
		
		estoque02.setNome("Estoque-Cereais");
		estoqueDao.save(estoque02);
		
		Assert.assertTrue(estoqueDao.findAll().size() == 2);
		
	}

	@Ignore
	public void testDelete()throws RepositoryException {
		
		estoque.setNome("Estoque-bebidas");
		estoqueDao.save(estoque);
		
		estoque02.setNome("Estoque-Cereais");
		estoqueDao.save(estoque02);
		
		estoqueDao.delete(estoque02);
		
		Assert.assertTrue(estoqueDao.findAll().size() == 1);
	}

	@Ignore
	public void testUpdate()throws RepositoryException {

		estoque.setNome("Estoque-bebidas");
		estoqueDao.save(estoque);
		
		estoque02.setNome("Estoque-Cereais");
		estoqueDao.save(estoque02);
		
		estoque02.setNome("Estoque-Alimentos");
		
		estoqueDao.update(estoque02);
		
		Assert.assertEquals(estoqueDao.findId(2).getNome(),"Estoque-Alimentos");
	}
	
	@Ignore
	public void testFindAll()throws RepositoryException {
		estoque.setNome("Estoque-bebidas");
		estoqueDao.save(estoque);
		
		estoque02.setNome("Estoque-Cereais");
		estoqueDao.save(estoque02);
		
		Assert.assertTrue(estoqueDao.findAll().size() == 2);
	}

	@Test
	public void testFindByName()throws RepositoryException {
		estoque.setNome("Estoque-bebidas");
		estoqueDao.save(estoque);
		
		estoque02.setNome("Estoque-Cereais");
		estoqueDao.save(estoque02);
		
		Assert.assertTrue(estoqueDao.findByName("Estoque-Cereais").equals(estoque02));
	}

	@Ignore
	public void testFindId()throws RepositoryException {
		estoque.setNome("Estoque-bebidas");
		estoqueDao.save(estoque);
		
		estoque02.setNome("Estoque-Cereais");
		estoqueDao.save(estoque02);
		
		Assert.assertFalse(estoqueDao.findId(1).getNome().equals("UFPB"));
	}
}
