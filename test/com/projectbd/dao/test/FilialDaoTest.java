package com.projectbd.dao.test;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


import com.projectbd.dao.FilialDao;
import com.projectbd.dao.RepositoryException;
import com.projectbd.entity.Filial;

public class FilialDaoTest {
	private Filial filial;
	private Filial filial02;
	private Filial filial03;
	private FilialDao dao; 
	
	@Before
	public void setUp() throws Exception {
		filial = new Filial();
		filial02 = new Filial();
		filial03 = new Filial();
		dao = new FilialDao();
	}



	@Ignore
	public void testSave() throws RepositoryException {
		filial.setNome("TodoDia - Mamanguape");
		dao.save(filial);
		
		Assert.assertEquals(dao.findId(1).getNome(),"TodoDia - Mamanguape");
	}

	@Ignore
	public void testDelete()throws RepositoryException {
		filial.setNome("TodoDia - Mamanguape");
		filial02.setNome("TodoDia - Jampa");
		filial03.setNome("TodoDia - Campina");
		
		dao.save(filial);
		dao.save(filial02);
		dao.save(filial03);
		
		dao.delete(filial);
		
		Assert.assertFalse(dao.findAll().contains(filial));
	}

	@Ignore
	public void testUpdate()throws RepositoryException {
		filial.setNome("TodoDia - Mamanguape");
		filial02.setNome("TodoDia - Jampa");
		filial03.setNome("TodoDia - Campina");
		
		dao.save(filial);
		dao.save(filial02);
		dao.save(filial03);
		
		filial02.setNome("João Pessoa");
		filial03.setNome("Campina Grande");
		
		dao.update(filial02);
		dao.update(filial03);
		
		Assert.assertEquals(dao.findId(2).getNome(),"João Pessoa");
		Assert.assertTrue(dao.findAll().get(2).getNome().equals("Campina Grande"));
	}

	@Ignore
	public void testFindId()throws	RepositoryException {
		filial.setNome("TodoDia - Mamanguape");
		filial02.setNome("TodoDia - Jampa");
		filial03.setNome("TodoDia - Campina");
		
		dao.save(filial);
		dao.save(filial02);
		dao.save(filial03);
		
		Assert.assertTrue(dao.findId(3).getNome().equals("TodoDia - Campina"));
	}
	
	@Ignore
	public void testFindAll()throws RepositoryException {
		filial.setNome("TodoDia - Mamanguape");
		filial02.setNome("TodoDia - Jampa");
		filial03.setNome("TodoDia - Campina");
		
		dao.save(filial);
		dao.save(filial02);
		dao.save(filial03);
		
		Assert.assertTrue(dao.findAll().get(1).getId() == 2);
	}

	@Test
	public void testFindByName()throws RepositoryException {
		filial.setNome("TodoDia - Mamanguape");
		filial02.setNome("TodoDia - Jampa");
		filial03.setNome("TodoDia - Campina");
		
		dao.save(filial);
		dao.save(filial02);
		dao.save(filial03);
		
		Assert.assertNotNull(dao.findByName("TodoDia - Jampa"));
		
	}
}
