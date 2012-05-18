package com.projectbd.dao.test;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.projectbd.dao.CidadeDao;
import com.projectbd.dao.EstadoDao;
import com.projectbd.dao.RepositoryException;
import com.projectbd.entity.Cidade;
import com.projectbd.entity.Estado;

public class CidadeDaoTest {
	
	private Cidade cidade;
	private Cidade cidade02;
	private Cidade cidade03;
	private Estado estado;
	private Estado estado02;
	private EstadoDao daoEstado;
	private CidadeDao daoCidade;

	@Before
	public void setUp() throws Exception {
		cidade = new Cidade();
		cidade02 = new Cidade();
		cidade03 = new Cidade();
		estado = new Estado();
		estado02 = new Estado();
		daoEstado = new EstadoDao();
		daoCidade = new CidadeDao();
	}
	
	@Ignore
	public void testSave()throws RepositoryException {
		estado.setNome("Paraíba");
		daoEstado.save(estado);
		
		cidade.setNome("Campina Grande");
		cidade.setEstado(estado);
		
		cidade02.setNome("Bayeux");
		cidade02.setEstado(estado);
		
		cidade03.setNome("Jampa");
		cidade03.setEstado(estado);
		
		daoCidade.save(cidade);
		daoCidade.save(cidade02);
		daoCidade.save(cidade03);
		
		Assert.assertEquals("Campina Grande",daoCidade.findId(1).getNome());
	}

	@Ignore
	public void testDelete()throws RepositoryException {
		estado.setNome("Paraíba");
		daoEstado.save(estado);
		
		cidade.setNome("Campina Grande");
		cidade.setEstado(estado);
		
		cidade02.setNome("Bayeux");
		cidade02.setEstado(estado);
		
		cidade03.setNome("Jampa");
		cidade03.setEstado(estado);
		
		daoCidade.save(cidade);
		daoCidade.save(cidade02);
		daoCidade.save(cidade03);
		
		daoCidade.delete(cidade);
		
		Assert.assertEquals(2,daoCidade.findAll().size());	
	}

	@Ignore
	public void testUpdate()throws RepositoryException {
		estado.setNome("Paraíba");
		daoEstado.save(estado);
		
		estado02.setNome("Pernanbuco");
		daoEstado.save(estado02);
		
		
		cidade.setNome("Campina Grande");
		cidade.setEstado(estado);
		
		daoCidade.save(cidade);
		
		cidade.setEstado(estado02);
		
		daoCidade.update(cidade);
		
		Assert.assertEquals("Pernanbuco",daoCidade.findId(1).getEstado().getNome());	
	}
	
	@Ignore
	public void testFindId()throws RepositoryException {
		estado.setNome("Paraíba");
		daoEstado.save(estado);
		
		cidade.setNome("Campina Grande");
		cidade.setEstado(estado);
		
		cidade02.setNome("Bayeux");
		cidade02.setEstado(estado);
		
		cidade03.setNome("Jampa");
		cidade03.setEstado(estado);
		
		daoCidade.save(cidade);
		daoCidade.save(cidade02);
		daoCidade.save(cidade03);
		
		Assert.assertEquals("Jampa",daoCidade.findId(3).getNome());
		
	}

	@Ignore
	public void testFindAll()throws RepositoryException {
		estado.setNome("Paraíba");
		daoEstado.save(estado);
		
		cidade.setNome("Campina Grande");
		cidade.setEstado(estado);
		
		cidade02.setNome("Bayeux");
		cidade02.setEstado(estado);
		
		cidade03.setNome("Jampa");
		cidade03.setEstado(estado);
		
		daoCidade.save(cidade);
		daoCidade.save(cidade02);
		daoCidade.save(cidade03);
		
		Assert.assertEquals(3,daoCidade.findAll().size());
	}

	@Test
	public void testFindByNameString()throws RepositoryException {
		estado.setNome("Paraíba");
		daoEstado.save(estado);
		
		cidade.setNome("Campina Grande");
		cidade.setEstado(estado);
		
		cidade02.setNome("Bayeux");
		cidade02.setEstado(estado);
		
		cidade03.setNome("Jampa");
		cidade03.setEstado(estado);
		
		daoCidade.save(cidade);
		daoCidade.save(cidade02);
		daoCidade.save(cidade03);
		
		Assert.assertFalse(daoCidade.findByName("Bayeux").equals(cidade03));
	}
}
