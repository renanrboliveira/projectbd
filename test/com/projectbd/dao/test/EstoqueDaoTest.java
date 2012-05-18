package com.projectbd.dao.test;


import junit.framework.Assert;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.projectbd.dao.EstoqueDao;
import com.projectbd.dao.FilialDao;
import com.projectbd.dao.RepositoryException;
import com.projectbd.entity.Estoque;
import com.projectbd.entity.Filial;

public class EstoqueDaoTest {
	private Estoque estoque;
	private Estoque estoque02;
	private Filial filial;
	private EstoqueDao estoqueDao;
	private FilialDao filialDao;
	

	@Before
	public void setUp() throws Exception {
		estoque = new Estoque();
		estoque02 = new Estoque();
		filial = new Filial();
		estoqueDao = new EstoqueDao();
		filialDao = new FilialDao();
	}

	@Ignore
	public void testSave()throws RepositoryException {
		filial.setNome("Todo Dia - Mamanguape");
		filialDao.save(filial);
		estoque.setFilial(filial);
		estoque.setNome("Estoque-bebidas");
		estoqueDao.save(estoque);
		
		estoque02.setFilial(filial);
		estoque02.setNome("Estoque-Cereais");
		estoqueDao.save(estoque02);
		
		Assert.assertTrue(estoqueDao.findAll().size() == 2);
		
	}

	@Ignore
	public void testDelete()throws RepositoryException {
		filial.setNome("Todo Dia - Mamanguape");
		filialDao.save(filial);
		
		estoque.setFilial(filial);
		estoque.setNome("Estoque-bebidas");
		estoqueDao.save(estoque);
		
		estoque02.setFilial(filial);
		estoque02.setNome("Estoque-Cereais");
		estoqueDao.save(estoque02);
		
		estoqueDao.delete(estoque02);
		
		Assert.assertTrue(estoqueDao.findAll().size() == 1);
	}

	@Ignore
	public void testUpdate()throws RepositoryException {
		filial.setNome("Todo Dia - Mamanguape");
		filialDao.save(filial);
		estoque.setFilial(filial);
		estoque.setNome("Estoque-bebidas");
		estoqueDao.save(estoque);
		
		estoque02.setFilial(filial);
		estoque02.setNome("Estoque-Cereais");
		estoqueDao.save(estoque02);
		
		estoque02.setNome("Estoque-Alimentos");
		
		estoqueDao.update(estoque02);
		
		Assert.assertEquals(estoqueDao.findId(2).getNome(),"Estoque-Alimentos");
	}
	
	@Ignore
	public void testFindAll()throws RepositoryException {
		filial.setNome("Todo Dia - Mamanguape");
		filialDao.save(filial);
		estoque.setFilial(filial);
		estoque.setNome("Estoque-bebidas");
		estoqueDao.save(estoque);
		
		estoque02.setFilial(filial);
		estoque02.setNome("Estoque-Cereais");
		estoqueDao.save(estoque02);
		
		Assert.assertTrue(estoqueDao.findAll().size() == 2);
	}

	@Ignore
	public void testFindByName()throws RepositoryException {
		filial.setNome("Todo Dia - Mamanguape");
		filialDao.save(filial);
		estoque.setFilial(filial);
		estoque.setNome("Estoque-bebidas");
		estoqueDao.save(estoque);
		
		estoque02.setFilial(filial);
		estoque02.setNome("Estoque-Cereais");
		estoqueDao.save(estoque02);
		
		Assert.assertTrue(estoqueDao.findByName("Estoque-Cereais").getFilial().getNome().equals("Todo Dia - Mamanguape"));
	}

	@Test
	public void testFindId()throws RepositoryException {
		filial.setNome("Todo Dia - Mamanguape");
		filialDao.save(filial);
		estoque.setFilial(filial);
		estoque.setNome("Estoque-bebidas");
		estoqueDao.save(estoque);
		
		estoque02.setFilial(filial);
		estoque02.setNome("Estoque-Cereais");
		estoqueDao.save(estoque02);
		
		Assert.assertFalse(estoqueDao.findId(1).getNome().equals("UFPB"));
	}
}
