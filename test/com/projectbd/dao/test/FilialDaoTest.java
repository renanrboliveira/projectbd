package com.projectbd.dao.test;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.projectbd.dao.FilialDao;
import com.projectbd.dao.RepositoryException;
import com.projectbd.entity.Filial;

public class FilialDaoTest {
	private Filial filial;
	private FilialDao dao; 
	
	@Before
	public void setUp() throws Exception {
		filial = new Filial();
		dao = new FilialDao();
	}

	@Ignore
	public void testFindAll() {
		fail("Not yet implemented");
	}

	@Ignore
	public void testFindByNameString() {
		fail("Not yet implemented");
	}

	@Ignore
	public void testGenericDaoImpl() {
		fail("Not yet implemented");
	}

	@Test
	public void testSave() throws RepositoryException {
		filial.setNome("TodoDia - Mamanguape");
		dao.save(filial);
		
		Assert.assertEquals(dao.findId(1).getNome(),"TodoDia - Mamanguape");
	}

	@Ignore
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testFind() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindAll1() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindByNameString1() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetEntityManager() {
		fail("Not yet implemented");
	}

}
