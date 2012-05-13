package com.projectbd.dao.test;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.projectbd.dao.CategoriaDao;
import com.projectbd.dao.EstoqueDao;
import com.projectbd.dao.FilialDao;
import com.projectbd.dao.ProdutoDao;
import com.projectbd.dao.RepositoryException;
import com.projectbd.entity.Categoria;
import com.projectbd.entity.Estoque;
import com.projectbd.entity.Filial;
import com.projectbd.entity.Produto;

public class ProdutoDaoTest {
	private ProdutoDao daoProduto;
	private EstoqueDao daoEstoque;
	private CategoriaDao daoCategoria;
	private Produto produto;
	private Categoria categoria;
	private Estoque estoque;
	private Filial filial;
	private FilialDao daoFilial;
	

	@Before
	public void setUp() throws Exception {
		daoCategoria = new CategoriaDao();
		daoFilial = new FilialDao();
		daoEstoque = new EstoqueDao();
		daoProduto = new ProdutoDao();
		produto = new Produto();
		filial = new Filial();
		estoque = new Estoque();
		categoria = new Categoria();
	}


	@Test(expected = RepositoryException.class)
	public void testFindAll() throws RepositoryException{
		categoria.setId(1);
		categoria.setNome("Refrigerantes");
		daoCategoria.save(categoria);
		
		filial.setId(1);
		filial.setNome("Todo Dia - Mamanguape");
		daoFilial.save(filial);
		
		estoque.setId(1);
		estoque.setNome("Est-Bebidas");
		estoque.setFilial(filial);
		daoEstoque.save(estoque);
		
		produto.setNome("Coca Cola");
		produto.setCategoria(categoria);
		produto.setEstoque(estoque);
		produto.setId(1);
		produto.setObservacao("-------");
		
		/** Salva o produto "Coca Cola"**/
		daoProduto.save(produto);
		
		
		categoria.setId(1);
		categoria.setNome("Refrigerantes");
		daoCategoria.save(categoria);
		
		filial.setId(1);
		filial.setNome("Todo Dia - Mamanguape");
		daoFilial.save(filial);
		
		estoque.setId(1);
		estoque.setNome("Est-Bebidas");
		estoque.setFilial(filial);
		daoEstoque.save(estoque);
		
		Produto pepsi = new Produto();
		pepsi.setNome("Pepsi");
		pepsi.setCategoria(categoria);
		pepsi.setEstoque(estoque);

		pepsi.setObservacao("-------");
		
		/** Salvou produto Pepsi**/
		daoProduto.save(pepsi);
		Assert.assertEquals(daoProduto.findAll().size(),2);
		

	}

	@Test(expected = RepositoryException.class)
	public void testFindByName() throws RepositoryException{
		categoria.setId(1);
		categoria.setNome("Refrigerantes");
		daoCategoria.save(categoria);
		
		filial.setId(1);
		filial.setNome("Todo Dia - Mamanguape");
		daoFilial.save(filial);
		
		estoque.setId(1);
		estoque.setNome("Est-Bebidas");
		estoque.setFilial(filial);
		daoEstoque.save(estoque);
		
		produto.setNome("Coca Cola");
		produto.setCategoria(categoria);
		produto.setEstoque(estoque);
		produto.setId(1);
		produto.setObservacao("-------");
		
		/** Salva o produto "Coca Cola"**/
		daoProduto.save(produto);
		
		
		categoria.setId(1);
		categoria.setNome("Refrigerantes");
		daoCategoria.save(categoria);
		
		filial.setId(1);
		filial.setNome("Todo Dia - Mamanguape");
		daoFilial.save(filial);
		
		estoque.setId(1);
		estoque.setNome("Est-Bebidas");
		estoque.setFilial(filial);
		daoEstoque.save(estoque);
		
		Produto pepsi = new Produto();
		pepsi.setNome("Pepsi");
		pepsi.setCategoria(categoria);
		pepsi.setEstoque(estoque);
		
		Assert.assertFalse(daoProduto.findByName("Pepsi").equals(produto));
		
	}


	@Test(expected = RepositoryException.class)
	public void testSave() throws RepositoryException{
		categoria.setId(1);
		categoria.setNome("Refrigerantes");
		daoCategoria.save(categoria);
		
		filial.setId(1);
		filial.setNome("Todo Dia - Mamanguape");
		daoFilial.save(filial);
		
		estoque.setId(1);
		estoque.setNome("Est-Bebidas");
		estoque.setFilial(filial);
		daoEstoque.save(estoque);
		
		produto.setNome("Coca Cola");
		produto.setCategoria(categoria);
		produto.setEstoque(estoque);
		produto.setId(1);
		produto.setObservacao("-------");
		
		/** Salva o produto Coca Cola**/
		daoProduto.save(produto);
		
		/** Testa se o produto Coca Cola foi salvo, procurando por ele pelo id**/
		Assert.assertEquals(daoProduto.findId(1).equals(produto),true);
	}

	@Test(expected = RepositoryException.class)
	public void testDelete() throws RepositoryException{
		categoria.setId(1);
		categoria.setNome("Refrigerantes");
		daoCategoria.save(categoria);
		
		filial.setId(1);
		filial.setNome("Todo Dia - Mamanguape");
		daoFilial.save(filial);
		
		estoque.setId(1);
		estoque.setNome("Est-Bebidas");
		estoque.setFilial(filial);
		daoEstoque.save(estoque);
		
		produto.setNome("Coca Cola");
		produto.setCategoria(categoria);
		produto.setEstoque(estoque);
		produto.setId(1);
		produto.setObservacao("-------");
		
		/** Salva o produto "Coca Cola"**/
		daoProduto.save(produto);
		
		
		categoria.setId(1);
		categoria.setNome("Refrigerantes");
		daoCategoria.save(categoria);
		
		filial.setId(1);
		filial.setNome("Todo Dia - Mamanguape");
		daoFilial.save(filial);
		
		estoque.setId(1);
		estoque.setNome("Est-Bebidas");
		estoque.setFilial(filial);
		daoEstoque.save(estoque);
		
		Produto pepsi = new Produto();
		pepsi.setNome("Pepsi");
		pepsi.setCategoria(categoria);
		pepsi.setEstoque(estoque);

		pepsi.setObservacao("-------");
		
		/** Salvou produto Pepsi**/
		daoProduto.save(pepsi);
		
		/** Deleta o produto Coca Cola**/
		daoProduto.delete(produto);
		
		/** Testa se na Tabela Produto comtém o produto Coca Cola**/
		Assert.assertEquals(daoProduto.findAll().contains(produto),false);
		
	}
	
	

	@Test(expected = RepositoryException.class)
	public void testUpdate()throws RepositoryException {
		categoria.setId(1);
		categoria.setNome("Refrigerantes");
		daoCategoria.save(categoria);
		
		filial.setId(1);
		filial.setNome("Todo Dia - Mamanguape");
		daoFilial.save(filial);
		
		estoque.setId(1);
		estoque.setNome("Est-Bebidas");
		estoque.setFilial(filial);
		daoEstoque.save(estoque);
		
		produto.setNome("Coca Cola");
		produto.setCategoria(categoria);
		produto.setEstoque(estoque);
		produto.setId(1);
		produto.setObservacao("-------");
		daoProduto.save(produto);
		
		produto.setNome("Coca Cola 3L");
		
		daoProduto.update(produto);
		
		Assert.assertEquals(daoProduto.findId(1).getNome(),"Coca Cola 3L");	
	}

	@Test(expected = RepositoryException.class)
	public void testFindId() throws RepositoryException{
		categoria.setId(1);
		categoria.setNome("Refrigerantes");
		daoCategoria.save(categoria);
		
		filial.setId(1);
		filial.setNome("Todo Dia - Mamanguape");
		daoFilial.save(filial);
		
		estoque.setId(1);
		estoque.setNome("Est-Bebidas");
		estoque.setFilial(filial);
		daoEstoque.save(estoque);
		
		produto.setNome("Coca Cola");
		produto.setCategoria(categoria);
		produto.setEstoque(estoque);
		produto.setId(1);
		produto.setObservacao("-------");
		
		/** Salva o produto "Coca Cola"**/
		daoProduto.save(produto);
		
		
		categoria.setId(1);
		categoria.setNome("Refrigerantes");
		daoCategoria.save(categoria);
		
		filial.setId(1);
		filial.setNome("Todo Dia - Mamanguape");
		daoFilial.save(filial);
		
		estoque.setId(1);
		estoque.setNome("Est-Bebidas");
		estoque.setFilial(filial);
		daoEstoque.save(estoque);
		
		Produto pepsi = new Produto();
		pepsi.setNome("Pepsi");
		pepsi.setCategoria(categoria);
		pepsi.setEstoque(estoque);

		pepsi.setObservacao("-------");
		
		/** Salvou produto Pepsi**/
		daoProduto.save(pepsi);
		
		Assert.assertTrue(daoProduto.findId(2).equals(pepsi));

	}
}
