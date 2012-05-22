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
import com.projectbd.dao.EstoqueDao;
import com.projectbd.dao.ProdutoDao;
import com.projectbd.dao.RepositoryException;
import com.projectbd.entity.Categoria;
import com.projectbd.entity.Estoque;
import com.projectbd.entity.Produto;

public class ProdutoDaoTest {
	private ProdutoDao daoProduto;
	private EstoqueDao daoEstoque;
	private CategoriaDao daoCategoria;
	private Produto produto;
	private Categoria categoria;
	private Estoque estoque;
	

	@Before
	public void setUp() throws Exception {
		daoCategoria = new CategoriaDao();
		daoEstoque = new EstoqueDao();
		daoProduto = new ProdutoDao();
		produto = new Produto();
		estoque = new Estoque();
		categoria = new Categoria();
	}


	
	
	@Ignore
	public void testUpdate()throws RepositoryException {
		categoria.setNome("Refrigerantes");
		daoCategoria.save(categoria);
		
		estoque.setNome("Est-Bebidas");
		daoEstoque.save(estoque);
		
		produto.setNome("Coca Cola");
		produto.setCategoria(categoria);
		produto.setEstoque(estoque);
		produto.setObservacao("-------");
		daoProduto.save(produto);
		
		produto.setNome("Coca Cola 3L");
		
		daoProduto.update(produto);
		
		Assert.assertEquals("Coca Cola 3L",daoProduto.findId(1).getNome());	
	}


	


	@Ignore
	public void testDelete() throws RepositoryException{
		categoria.setNome("Refrigerantes");
		daoCategoria.save(categoria);
		
		estoque.setNome("Est-Bebidas");
		daoEstoque.save(estoque);
		
		produto.setNome("Coca Cola");
		produto.setCategoria(categoria);
		produto.setEstoque(estoque);
		produto.setObservacao("-------");
		
		/** Salva o produto "Coca Cola"**/
		daoProduto.save(produto);
		
		
		categoria.setNome("Refrigerantes");
		daoCategoria.save(categoria);
		
		estoque.setNome("Est-Bebidas");
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
	

	@Test
	public void testSave() throws RepositoryException{
		categoria.setNome("Refrigerantes");
		daoCategoria.save(categoria);
		
		estoque.setNome("Est-Bebidas");
		daoEstoque.save(estoque);
		
		produto.setNome("Coca Cola");
		produto.setCategoria(categoria);
		produto.setEstoque(estoque);
		produto.setObservacao("-------");
		
		/** Salva o produto Coca Cola**/
		daoProduto.save(produto);
		
		/** Testa se o produto Coca Cola foi salvo, procurando por ele pelo id**/
		Assert.assertEquals(true,daoProduto.findId(1).equals(produto));
	}



	@Ignore
	public void testFindId() throws RepositoryException{
		categoria.setNome("Refrigerantes");
		daoCategoria.save(categoria);
		
		estoque.setNome("Est-Bebidas");
		daoEstoque.save(estoque);
		
		produto.setNome("Fanta Uva");
		produto.setCategoria(categoria);
		produto.setEstoque(estoque);
		produto.setObservacao("-------");
		
		/** Salva o produto "Coca Cola"**/
		daoProduto.save(produto);
		
		
		
		categoria.setNome("Refrigerantes");
		daoCategoria.save(categoria);
		
		estoque.setNome("Est-Bebidas");
		daoEstoque.save(estoque);
		
		Produto sprite = new Produto();
		sprite.setNome("Sprite");
		sprite.setCategoria(categoria);
		sprite.setEstoque(estoque);

		sprite.setObservacao("-------");
		
		/** Salvou produto Pepsi**/
		daoProduto.save(sprite);
		
		Assert.assertTrue(daoProduto.findId(2).equals(sprite));

	}
	
	@Ignore
	public void testFindAll() throws RepositoryException{
		categoria.setNome("Refrigerantes");
		daoCategoria.save(categoria);
		
		estoque.setNome("Est-Bebidas");
		daoEstoque.save(estoque);
		
		produto.setNome("Coca Cola");
		produto.setCategoria(categoria);
		produto.setEstoque(estoque);
		produto.setObservacao("-------");
		
		/** Salva o produto "Coca Cola"**/
		daoProduto.save(produto);
		
		
		categoria.setNome("Refrigerantes");
		daoCategoria.save(categoria);
		
		estoque.setNome("Est-Bebidas");
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
	
	@Ignore
	public void testFindByName() throws RepositoryException{
		
		categoria.setNome("Refrigerantes");
		daoCategoria.save(categoria);
		
		estoque.setNome("Est-Bebidas");
		daoEstoque.save(estoque);
		
		produto.setNome("Coca Cola");
		produto.setCategoria(categoria);
		produto.setEstoque(estoque);
		produto.setObservacao("-------");
		
		/** Salva o produto "Coca Cola"**/
		daoProduto.save(produto);
		
		Produto pepsi = new Produto();
		pepsi.setNome("Pepsi");
		pepsi.setCategoria(categoria);
		pepsi.setEstoque(estoque);
		pepsi.setObservacao("--------");
		
		/** Salvando o produto Pepsi**/
		daoProduto.save(pepsi);
		
		Assert.assertFalse(daoProduto.findByName("Pepsi").equals(produto));
		
	}
}
