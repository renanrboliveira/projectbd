package com.projectbd.dao;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.projectbd.entity.Estado;

public class EstadoDaoTest {

	private Estado estado;
	private EstadoDao estadoDao;

	@Before
	public void setUp() throws Exception {

		estadoDao = new EstadoDao();
	}

	@Test
	public void criarEstadoTest() throws RepositoryException {

		estado = new Estado();

		estado.setNome("BA");

		estadoDao.save(estado);

		estadoDao = new EstadoDao();

		Assert.assertEquals(estadoDao.findByName("BA").getNome(), "BA");

		estadoDao = new EstadoDao();

		Estado estado = estadoDao.findByName("BA");

		estadoDao.delete(estado);

	}

	@Test
	public void buscarPorNomeTest() throws RepositoryException {

		estado = new Estado();

		estado.setNome("PB");

		estadoDao.save(estado);

		estadoDao = new EstadoDao();

		Assert.assertEquals(estadoDao.findByName("PB").getNome(), "PB");

		estadoDao = new EstadoDao();

		Estado estado = estadoDao.findByName("PB");

		estadoDao.delete(estado);
	}
	
	@Test
	public void removerTest(){
		
		estadoDao = new EstadoDao();
		
		Estado estado = estadoDao.find(32);
		
		estadoDao.delete(estado);
		
		Assert.assertNull(estadoDao.find(32));
	}

}
