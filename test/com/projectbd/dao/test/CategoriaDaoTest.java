package com.projectbd.dao.test;
/** 
 * @author Paulo Antonio
 * @author Renan Oliveira
 * **/

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.projectbd.dao.CategoriaDao;
import com.projectbd.dao.RepositoryException;
import com.projectbd.entity.Categoria;

public class CategoriaDaoTest {
	private Categoria categoria;
	private Categoria categoria02;
	private Categoria categoria03;
	private CategoriaDao dao;

	@Before
	public void setUp() throws Exception {
		categoria = new Categoria();
		categoria02 = new Categoria();
		categoria03 = new Categoria();
		dao = new CategoriaDao();
	}

	@Ignore
	public void testFindAll() throws RepositoryException {
		categoria.setNome("Comodities");
		/** Salvando a categoria **/
		dao.save(categoria);
		
		categoria02.setNome("Bebidas");
		/** Salvando categoria02**/
		dao.save(categoria02);
		
		categoria03.setNome("Cereais");
		/** Salvando categoria03**/
		dao.save(categoria03);
		
		Assert.assertEquals(dao.findAll().size(),3);
		
		
	}

	@Ignore
	public void testFindByName()throws RepositoryException {
		categoria.setNome("Comodities");
		/** Salvando a categoria **/
		dao.save(categoria);
		
		categoria02.setNome("Bebidas");
		/** Salvando categoria02**/
		dao.save(categoria02);
		
		categoria03.setNome("Cereais");
		/** Salvando categoria03**/
		dao.save(categoria03);
		
		Assert.assertTrue(dao.findByName("Bebidas").equals(categoria02));	
	}

	@Ignore
	public void testSave() throws RepositoryException{
		categoria.setNome("Papel");
		categoria02.setNome("Eletro");
		categoria03.setNome("Outros");
		
		dao.save(categoria);
		dao.save(categoria02);
		dao.save(categoria03);
		 Assert.assertEquals(false,dao.findId(3).equals(categoria));
		
	}

	@Ignore
	public void testDelete() throws RepositoryException {
		categoria.setNome("Alimentos");
		categoria02.setNome("Bebidas");
		categoria03.setNome("Higiene");
		
		dao.save(categoria);
		dao.save(categoria02);
		dao.save(categoria03);
		
		/** Deletando categoria02**/
		dao.delete(categoria02);
		Assert.assertEquals(2,dao.findAll().size());
		
	}

	@Ignore
	public void testUpdate()throws RepositoryException {
		categoria03.setNome("Higiene");
		dao.save(categoria03);
		
		categoria03.setNome("Higiene Pessoal");
		dao.update(categoria03);
		
		Assert.assertEquals("Higiene Pessoal",dao.findId(1).getNome());
		
	}

	@Test
	public void testFindId() throws RepositoryException{
		categoria.setNome("Lubrificantes");
		dao.save(categoria);
		Assert.assertFalse(dao.findId(1).equals(categoria02));
	}

}
