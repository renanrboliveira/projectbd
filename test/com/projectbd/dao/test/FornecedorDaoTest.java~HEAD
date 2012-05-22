package com.projectbd.dao.test;


import junit.framework.Assert;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.projectbd.dao.CategoriaDao;
import com.projectbd.dao.CidadeDao;
import com.projectbd.dao.EnderecoDao;
import com.projectbd.dao.EstadoDao;
import com.projectbd.dao.EstoqueDao;
import com.projectbd.dao.FornecedorDao;
import com.projectbd.dao.ProdutoDao;
import com.projectbd.dao.RepositoryException;
import com.projectbd.entity.Categoria;
import com.projectbd.entity.Cidade;
import com.projectbd.entity.Endereco;
import com.projectbd.entity.Estado;
import com.projectbd.entity.Estoque;
import com.projectbd.entity.Fornecedor;
import com.projectbd.entity.Produto;

public class FornecedorDaoTest {
	private Fornecedor fornecedor;
	private Fornecedor fornecedor02;
	private Fornecedor fornecedor03;
	private Estoque estForn;
	private Estoque estForn02;
	private Estoque estForn03;
	private Categoria bebidas;
	private Categoria alimentos;
	private Categoria limpeza;
	private Produto coca;
	private Produto fanta;
	private Produto pepsi;
	private Produto arroz;
	private Produto feijao;
	private Produto macarrao;
	private Produto sabao;
	private Produto detergente;
	private Produto bombril;
	private Cidade cidade;
	private Estado estado;
	private Endereco endereco;
	private Endereco endereco02;
	private Endereco endereco03;
	private FornecedorDao daoFornecedor;
	private ProdutoDao daoProduto;
	private EnderecoDao daoEndereco;
	private CidadeDao daoCidade;
	private EstadoDao daoEstado;
	private EstoqueDao daoEstoque;
	private CategoriaDao daoCategoria;
	

	@Before
	public void setUp() throws Exception {
		fornecedor = new Fornecedor();
		fornecedor02 = new Fornecedor();
		fornecedor03 = new Fornecedor();
		estForn = new Estoque();
		estForn02 = new Estoque();
		estForn03 = new Estoque();
		bebidas = new Categoria();
		alimentos = new Categoria();
		limpeza = new Categoria();
		coca = new Produto();
		fanta = new Produto();
		pepsi = new Produto();
		arroz = new Produto();
		feijao = new Produto();
		macarrao = new Produto();
		sabao = new Produto();
		bombril = new Produto();
		detergente = new Produto();
		endereco = new Endereco();
		endereco02 = new Endereco();
		endereco03 = new Endereco();
		cidade = new Cidade();
		estado = new Estado();
		daoFornecedor = new FornecedorDao();
		daoProduto = new ProdutoDao();
		daoEstado = new EstadoDao();
		daoCidade = new CidadeDao();
		daoEndereco = new EnderecoDao();
		daoEstoque = new EstoqueDao();
		daoCategoria = new CategoriaDao();
	}
	
	@Ignore
	public void testSave()throws RepositoryException {
		
		/*----------------------------------- Estado -----------------------------*/
		estado.setNome("Paraíba");
		daoEstado.save(estado);
		
		/*------------------------------------ Cidade -----------------------------*/
		cidade.setNome("Mamanguape");
		cidade.setEstado(estado);
		daoCidade.save(cidade);
		
		/*------------------------------------- Endereços -----------------------------*/
		endereco.setCep("58280-000");
		endereco.setLogradouro("Rua da Taboca");
		endereco.setNumero(783);
		endereco.setCidade(cidade);
		daoEndereco.save(endereco);
		
		endereco02.setCep("58280-000");
		endereco02.setLogradouro("Rua da Areia");
		endereco02.setNumero(100);
		endereco02.setCidade(cidade);
		daoEndereco.save(endereco02);
		
		endereco03.setCep("58280-000");
		endereco03.setLogradouro("Rua do Imperador");
		endereco03.setNumero(50);
		endereco03.setCidade(cidade);
		daoEndereco.save(endereco03);
		
		/*----------------------------------------- Estoque -----------------------------*/
		estForn.setNome("Estoque Martins");
		daoEstoque.save(estForn);
		
		estForn02.setNome("Estoque Nordece");
		daoEstoque.save(estForn02);
		
		estForn03.setNome("Estoque Nutriday");
		daoEstoque.save(estForn03);
		
		/*------------------------------------------ Categorias -----------------------------------------------*/
		alimentos.setNome("Alimentos");
		daoCategoria.save(alimentos);
		
		bebidas.setNome("Bebidas");
		daoCategoria.save(bebidas);
		
		limpeza.setNome("Limpeza");
		daoCategoria.save(limpeza);
		
		
		/*------------------------------------------ Fornecedor Martins (Alimentos) -----------------------------*/
		arroz.setNome("Arroz Olivo - 1kg");
		arroz.setCategoria(alimentos);
		arroz.setEstoque(estForn);
		arroz.setObservacao("Parbolizado");
		daoProduto.save(arroz);
		
		feijao.setNome("Boa Safra - 1kg");
		feijao.setCategoria(alimentos);
		feijao.setEstoque(estForn);
		feijao.setObservacao("Preto");
		daoProduto.save(feijao);
		
		macarrao.setNome("Adria - 500g");
		macarrao.setCategoria(alimentos);
		macarrao.setEstoque(estForn);
		macarrao.setObservacao("Espaguete");
		daoProduto.save(macarrao);
		
		
		fornecedor.setNome("Distribuidora Martins Ltda");
		fornecedor.setEndereco(endereco);// rua da taboca
		fornecedor.setEstoque(estForn);//Estoque Martins
		daoFornecedor.save(fornecedor);
		
		/*------------------------------------------Fornecedor Nordece (Bebidas)--------------------*/
		coca.setNome("Coca Cola");
		coca.setCategoria(bebidas);
		coca.setEstoque(estForn02);
		coca.setObservacao("2 Litros");
		daoProduto.save(coca);
		
		fanta.setNome("Fanta Laranja");
		fanta.setCategoria(bebidas);
		fanta.setEstoque(estForn02);
		fanta.setObservacao("1 Litro");
		daoProduto.save(fanta);
		
		pepsi.setNome("Pepsi Twist");
		pepsi.setCategoria(bebidas);
		pepsi.setEstoque(estForn02);
		pepsi.setNome("500 ml");
		pepsi.setObservacao("500 ml");
		daoProduto.save(pepsi);
		
		fornecedor02.setNome("Nordece");
		fornecedor02.setEndereco(endereco02);//rua da Areia
		fornecedor02.setEstoque(estForn02);//Estoque Nordece
		daoFornecedor.save(fornecedor02);
		
		/*------------------------------------------Fornecedor Nutriday (Limpeza)--------------------*/
		sabao.setNome("Sabão Ypê");
		sabao.setCategoria(limpeza);
		sabao.setEstoque(estForn03);
		sabao.setObservacao("Sabão de Coco");
		daoProduto.save(sabao);
		
		detergente.setNome("Detergente Ypê");
		detergente.setCategoria(limpeza);
		detergente.setEstoque(estForn03);
		detergente.setObservacao("Detergente Neutro");
		daoProduto.save(detergente);
		
		bombril.setNome("Bom bril");
		bombril.setCategoria(limpeza);
		bombril.setEstoque(estForn03);
		bombril.setObservacao("Esponja de aço");
		daoProduto.save(bombril);
		
		fornecedor03.setNome("Nutriday");
		fornecedor03.setEndereco(endereco03);
		fornecedor03.setEstoque(estForn03);
		daoFornecedor.save(fornecedor03);
		
		/*------------------------------------------ Teste --------------------*/
		Assert.assertTrue(daoFornecedor.findId(1).getNome().equals("Distribuidora Martins Ltda"));
		
	}

	@Ignore
	public void testDelete()throws RepositoryException {
		/*----------------------------------- Estado -----------------------------*/
		estado.setNome("Paraíba");
		daoEstado.save(estado);
		
		/*------------------------------------ Cidade -----------------------------*/
		cidade.setNome("Mamanguape");
		cidade.setEstado(estado);
		daoCidade.save(cidade);
		
		/*------------------------------------- Endereços -----------------------------*/
		endereco.setCep("58280-000");
		endereco.setLogradouro("Rua da Taboca");
		endereco.setNumero(783);
		endereco.setCidade(cidade);
		daoEndereco.save(endereco);
		
		endereco02.setCep("58280-000");
		endereco02.setLogradouro("Rua da Areia");
		endereco02.setNumero(100);
		endereco02.setCidade(cidade);
		daoEndereco.save(endereco02);
		
		endereco03.setCep("58280-000");
		endereco03.setLogradouro("Rua do Imperador");
		endereco03.setNumero(50);
		endereco03.setCidade(cidade);
		daoEndereco.save(endereco03);
		
		/*----------------------------------------- Estoque -----------------------------*/
		estForn.setNome("Estoque Martins");
		daoEstoque.save(estForn);
		
		estForn02.setNome("Estoque Nordece");
		daoEstoque.save(estForn02);
		
		estForn03.setNome("Estoque Nutriday");
		daoEstoque.save(estForn03);
		
		/*------------------------------------------ Categorias -----------------------------------------------*/
		alimentos.setNome("Alimentos");
		daoCategoria.save(alimentos);
		
		bebidas.setNome("Bebidas");
		daoCategoria.save(bebidas);
		
		limpeza.setNome("Limpeza");
		daoCategoria.save(limpeza);
		
		
		/*------------------------------------------ Fornecedor Martins (Alimentos) -----------------------------*/
		arroz.setNome("Arroz Olivo - 1kg");
		arroz.setCategoria(alimentos);
		arroz.setEstoque(estForn);
		arroz.setObservacao("Parbolizado");
		daoProduto.save(arroz);
		
		feijao.setNome("Boa Safra - 1kg");
		feijao.setCategoria(alimentos);
		feijao.setEstoque(estForn);
		feijao.setObservacao("Preto");
		daoProduto.save(feijao);
		
		macarrao.setNome("Adria - 500g");
		macarrao.setCategoria(alimentos);
		macarrao.setEstoque(estForn);
		macarrao.setObservacao("Espaguete");
		daoProduto.save(macarrao);
		
		
		fornecedor.setNome("Distribuidora Martins Ltda");
		fornecedor.setEndereco(endereco);// rua da taboca
		fornecedor.setEstoque(estForn);//Estoque Martins
		daoFornecedor.save(fornecedor);
		
		/*------------------------------------------Fornecedor Nordece (Bebidas)--------------------*/
		coca.setNome("Coca Cola");
		coca.setCategoria(bebidas);
		coca.setEstoque(estForn02);
		coca.setObservacao("2 Litros");
		daoProduto.save(coca);
		
		fanta.setNome("Fanta Laranja");
		fanta.setCategoria(bebidas);
		fanta.setEstoque(estForn02);
		fanta.setObservacao("1 Litro");
		daoProduto.save(fanta);
		
		pepsi.setNome("Pepsi Twist");
		pepsi.setCategoria(bebidas);
		pepsi.setEstoque(estForn02);
		pepsi.setNome("500 ml");
		pepsi.setObservacao("500 ml");
		daoProduto.save(pepsi);
		
		fornecedor02.setNome("Nordece");
		fornecedor02.setEndereco(endereco02);//rua da Areia
		fornecedor02.setEstoque(estForn02);//Estoque Nordece
		daoFornecedor.save(fornecedor02);
		
		/*------------------------------------------Fornecedor Nutriday (Limpeza)--------------------*/
		sabao.setNome("Sabão Ypê");
		sabao.setCategoria(limpeza);
		sabao.setEstoque(estForn03);
		sabao.setObservacao("Sabão de Coco");
		daoProduto.save(sabao);
		
		detergente.setNome("Detergente Ypê");
		detergente.setCategoria(limpeza);
		detergente.setEstoque(estForn03);
		detergente.setObservacao("Detergente Neutro");
		daoProduto.save(detergente);
		
		bombril.setNome("Bom bril");
		bombril.setCategoria(limpeza);
		bombril.setEstoque(estForn03);
		bombril.setObservacao("Esponja de aço");
		daoProduto.save(bombril);
		
		fornecedor03.setNome("Nutriday");
		fornecedor03.setEndereco(endereco03);
		fornecedor03.setEstoque(estForn03);
		daoFornecedor.save(fornecedor03);
		
		/*----------------------- Teste ----------------------------*/
		daoFornecedor.delete(fornecedor);
		Assert.assertEquals(daoFornecedor.findAll().size(),2);
		
	}

	@Ignore
	public void testUpdate()throws RepositoryException {
		/*----------------------------------- Estado -----------------------------*/
		estado.setNome("Paraíba");
		daoEstado.save(estado);
		
		/*------------------------------------ Cidade -----------------------------*/
		cidade.setNome("Mamanguape");
		cidade.setEstado(estado);
		daoCidade.save(cidade);
		
		/*------------------------------------- Endereços -----------------------------*/
		endereco.setCep("58280-000");
		endereco.setLogradouro("Rua da Taboca");
		endereco.setNumero(783);
		endereco.setCidade(cidade);
		daoEndereco.save(endereco);
		
		endereco02.setCep("58280-000");
		endereco02.setLogradouro("Rua da Areia");
		endereco02.setNumero(100);
		endereco02.setCidade(cidade);
		daoEndereco.save(endereco02);
		
		endereco03.setCep("58280-000");
		endereco03.setLogradouro("Rua do Imperador");
		endereco03.setNumero(50);
		endereco03.setCidade(cidade);
		daoEndereco.save(endereco03);
		
		/*----------------------------------------- Estoque -----------------------------*/
		estForn.setNome("Estoque Martins");
		daoEstoque.save(estForn);
		
		estForn02.setNome("Estoque Nordece");
		daoEstoque.save(estForn02);
		
		estForn03.setNome("Estoque Nutriday");
		daoEstoque.save(estForn03);
		
		/*------------------------------------------ Categorias -----------------------------------------------*/
		alimentos.setNome("Alimentos");
		daoCategoria.save(alimentos);
		
		bebidas.setNome("Bebidas");
		daoCategoria.save(bebidas);
		
		limpeza.setNome("Limpeza");
		daoCategoria.save(limpeza);
		
		
		/*------------------------------------------ Fornecedor Martins (Alimentos) -----------------------------*/
		arroz.setNome("Arroz Olivo - 1kg");
		arroz.setCategoria(alimentos);
		arroz.setEstoque(estForn);
		arroz.setObservacao("Parbolizado");
		daoProduto.save(arroz);
		
		feijao.setNome("Boa Safra - 1kg");
		feijao.setCategoria(alimentos);
		feijao.setEstoque(estForn);
		feijao.setObservacao("Preto");
		daoProduto.save(feijao);
		
		macarrao.setNome("Adria - 500g");
		macarrao.setCategoria(alimentos);
		macarrao.setEstoque(estForn);
		macarrao.setObservacao("Espaguete");
		daoProduto.save(macarrao);
		
		
		fornecedor.setNome("Distribuidora Martins Ltda");
		fornecedor.setEndereco(endereco);// rua da taboca
		fornecedor.setEstoque(estForn);//Estoque Martins
		daoFornecedor.save(fornecedor);
		
		/*------------------------------------------Fornecedor Nordece (Bebidas)--------------------*/
		coca.setNome("Coca Cola");
		coca.setCategoria(bebidas);
		coca.setEstoque(estForn02);
		coca.setObservacao("2 Litros");
		daoProduto.save(coca);
		
		fanta.setNome("Fanta Laranja");
		fanta.setCategoria(bebidas);
		fanta.setEstoque(estForn02);
		fanta.setObservacao("1 Litro");
		daoProduto.save(fanta);
		
		pepsi.setNome("Pepsi Twist");
		pepsi.setCategoria(bebidas);
		pepsi.setEstoque(estForn02);
		pepsi.setNome("500 ml");
		pepsi.setObservacao("500 ml");
		daoProduto.save(pepsi);
		
		fornecedor02.setNome("Nordece");
		fornecedor02.setEndereco(endereco02);//rua da Areia
		fornecedor02.setEstoque(estForn02);//Estoque Nordece
		daoFornecedor.save(fornecedor02);
		
		/*------------------------------------------Fornecedor Nutriday (Limpeza)--------------------*/
		sabao.setNome("Sabão Ypê");
		sabao.setCategoria(limpeza);
		sabao.setEstoque(estForn03);
		sabao.setObservacao("Sabão de Coco");
		daoProduto.save(sabao);
		
		detergente.setNome("Detergente Ypê");
		detergente.setCategoria(limpeza);
		detergente.setEstoque(estForn03);
		detergente.setObservacao("Detergente Neutro");
		daoProduto.save(detergente);
		
		bombril.setNome("Bom bril");
		bombril.setCategoria(limpeza);
		bombril.setEstoque(estForn03);
		bombril.setObservacao("Esponja de aço");
		daoProduto.save(bombril);
		
		fornecedor03.setNome("Nutriday");
		fornecedor03.setEndereco(endereco03);
		fornecedor03.setEstoque(estForn03);
		daoFornecedor.save(fornecedor03);
		
		/*----------------------- Teste ----------------------------*/
		String novoNome = "Unillever";
		fornecedor.setNome(novoNome);
		daoFornecedor.update(fornecedor);
		Assert.assertTrue(daoFornecedor.findId(1).getNome().equals(novoNome));
		
	}

	@Ignore
	public void testFindId()throws RepositoryException {
		/*----------------------------------- Estado -----------------------------*/
		estado.setNome("Paraíba");
		daoEstado.save(estado);
		
		/*------------------------------------ Cidade -----------------------------*/
		cidade.setNome("Mamanguape");
		cidade.setEstado(estado);
		daoCidade.save(cidade);
		
		/*------------------------------------- Endereços -----------------------------*/
		endereco.setCep("58280-000");
		endereco.setLogradouro("Rua da Taboca");
		endereco.setNumero(783);
		endereco.setCidade(cidade);
		daoEndereco.save(endereco);
		
		endereco02.setCep("58280-000");
		endereco02.setLogradouro("Rua da Areia");
		endereco02.setNumero(100);
		endereco02.setCidade(cidade);
		daoEndereco.save(endereco02);
		
		endereco03.setCep("58280-000");
		endereco03.setLogradouro("Rua do Imperador");
		endereco03.setNumero(50);
		endereco03.setCidade(cidade);
		daoEndereco.save(endereco03);
		
		/*----------------------------------------- Estoque -----------------------------*/
		estForn.setNome("Estoque Martins");
		daoEstoque.save(estForn);
		
		estForn02.setNome("Estoque Nordece");
		daoEstoque.save(estForn02);
		
		estForn03.setNome("Estoque Nutriday");
		daoEstoque.save(estForn03);
		
		/*------------------------------------------ Categorias -----------------------------------------------*/
		alimentos.setNome("Alimentos");
		daoCategoria.save(alimentos);
		
		bebidas.setNome("Bebidas");
		daoCategoria.save(bebidas);
		
		limpeza.setNome("Limpeza");
		daoCategoria.save(limpeza);
		
		
		/*------------------------------------------ Fornecedor Martins (Alimentos) -----------------------------*/
		arroz.setNome("Arroz Olivo - 1kg");
		arroz.setCategoria(alimentos);
		arroz.setEstoque(estForn);
		arroz.setObservacao("Parbolizado");
		daoProduto.save(arroz);
		
		feijao.setNome("Boa Safra - 1kg");
		feijao.setCategoria(alimentos);
		feijao.setEstoque(estForn);
		feijao.setObservacao("Preto");
		daoProduto.save(feijao);
		
		macarrao.setNome("Adria - 500g");
		macarrao.setCategoria(alimentos);
		macarrao.setEstoque(estForn);
		macarrao.setObservacao("Espaguete");
		daoProduto.save(macarrao);
		
		
		fornecedor.setNome("Distribuidora Martins Ltda");
		fornecedor.setEndereco(endereco);// rua da taboca
		fornecedor.setEstoque(estForn);//Estoque Martins
		daoFornecedor.save(fornecedor);
		
		/*------------------------------------------Fornecedor Nordece (Bebidas)--------------------*/
		coca.setNome("Coca Cola");
		coca.setCategoria(bebidas);
		coca.setEstoque(estForn02);
		coca.setObservacao("2 Litros");
		daoProduto.save(coca);
		
		fanta.setNome("Fanta Laranja");
		fanta.setCategoria(bebidas);
		fanta.setEstoque(estForn02);
		fanta.setObservacao("1 Litro");
		daoProduto.save(fanta);
		
		pepsi.setNome("Pepsi Twist");
		pepsi.setCategoria(bebidas);
		pepsi.setEstoque(estForn02);
		pepsi.setNome("500 ml");
		pepsi.setObservacao("500 ml");
		daoProduto.save(pepsi);
		
		fornecedor02.setNome("Nordece");
		fornecedor02.setEndereco(endereco02);//rua da Areia
		fornecedor02.setEstoque(estForn02);//Estoque Nordece
		daoFornecedor.save(fornecedor02);
		
		/*------------------------------------------Fornecedor Nutriday (Limpeza)--------------------*/
		sabao.setNome("Sabão Ypê");
		sabao.setCategoria(limpeza);
		sabao.setEstoque(estForn03);
		sabao.setObservacao("Sabão de Coco");
		daoProduto.save(sabao);
		
		detergente.setNome("Detergente Ypê");
		detergente.setCategoria(limpeza);
		detergente.setEstoque(estForn03);
		detergente.setObservacao("Detergente Neutro");
		daoProduto.save(detergente);
		
		bombril.setNome("Bom bril");
		bombril.setCategoria(limpeza);
		bombril.setEstoque(estForn03);
		bombril.setObservacao("Esponja de aço");
		daoProduto.save(bombril);
		
		fornecedor03.setNome("Nutriday");
		fornecedor03.setEndereco(endereco03);
		fornecedor03.setEstoque(estForn03);
		daoFornecedor.save(fornecedor03);
		
		/*----------------------- Teste ----------------------------*/
		Assert.assertTrue(daoFornecedor.findId(1).getNome().equals("Distribuidora Martins Ltda"));
	}
	
	@Ignore
	public void testFindAll()throws RepositoryException{
		/*----------------------------------- Estado -----------------------------*/
		estado.setNome("Paraíba");
		daoEstado.save(estado);
		
		/*------------------------------------ Cidade -----------------------------*/
		cidade.setNome("Mamanguape");
		cidade.setEstado(estado);
		daoCidade.save(cidade);
		
		/*------------------------------------- Endereços -----------------------------*/
		endereco.setCep("58280-000");
		endereco.setLogradouro("Rua da Taboca");
		endereco.setNumero(783);
		endereco.setCidade(cidade);
		daoEndereco.save(endereco);
		
		endereco02.setCep("58280-000");
		endereco02.setLogradouro("Rua da Areia");
		endereco02.setNumero(100);
		endereco02.setCidade(cidade);
		daoEndereco.save(endereco02);
		
		endereco03.setCep("58280-000");
		endereco03.setLogradouro("Rua do Imperador");
		endereco03.setNumero(50);
		endereco03.setCidade(cidade);
		daoEndereco.save(endereco03);
		
		/*----------------------------------------- Estoque -----------------------------*/
		estForn.setNome("Estoque Martins");
		daoEstoque.save(estForn);
		
		estForn02.setNome("Estoque Nordece");
		daoEstoque.save(estForn02);
		
		estForn03.setNome("Estoque Nutriday");
		daoEstoque.save(estForn03);
		
		/*------------------------------------------ Categorias -----------------------------------------------*/
		alimentos.setNome("Alimentos");
		daoCategoria.save(alimentos);
		
		bebidas.setNome("Bebidas");
		daoCategoria.save(bebidas);
		
		limpeza.setNome("Limpeza");
		daoCategoria.save(limpeza);
		
		
		/*------------------------------------------ Fornecedor Martins (Alimentos) -----------------------------*/
		arroz.setNome("Arroz Olivo - 1kg");
		arroz.setCategoria(alimentos);
		arroz.setEstoque(estForn);
		arroz.setObservacao("Parbolizado");
		daoProduto.save(arroz);
		
		feijao.setNome("Boa Safra - 1kg");
		feijao.setCategoria(alimentos);
		feijao.setEstoque(estForn);
		feijao.setObservacao("Preto");
		daoProduto.save(feijao);
		
		macarrao.setNome("Adria - 500g");
		macarrao.setCategoria(alimentos);
		macarrao.setEstoque(estForn);
		macarrao.setObservacao("Espaguete");
		daoProduto.save(macarrao);
		
		
		fornecedor.setNome("Distribuidora Martins Ltda");
		fornecedor.setEndereco(endereco);// rua da taboca
		fornecedor.setEstoque(estForn);//Estoque Martins
		daoFornecedor.save(fornecedor);
		
		/*------------------------------------------Fornecedor Nordece (Bebidas)--------------------*/
		coca.setNome("Coca Cola");
		coca.setCategoria(bebidas);
		coca.setEstoque(estForn02);
		coca.setObservacao("2 Litros");
		daoProduto.save(coca);
		
		fanta.setNome("Fanta Laranja");
		fanta.setCategoria(bebidas);
		fanta.setEstoque(estForn02);
		fanta.setObservacao("1 Litro");
		daoProduto.save(fanta);
		
		pepsi.setNome("Pepsi Twist");
		pepsi.setCategoria(bebidas);
		pepsi.setEstoque(estForn02);
		pepsi.setNome("500 ml");
		pepsi.setObservacao("500 ml");
		daoProduto.save(pepsi);
		
		fornecedor02.setNome("Nordece");
		fornecedor02.setEndereco(endereco02);//rua da Areia
		fornecedor02.setEstoque(estForn02);//Estoque Nordece
		daoFornecedor.save(fornecedor02);
		
		/*------------------------------------------Fornecedor Nutriday (Limpeza)--------------------*/
		sabao.setNome("Sabão Ypê");
		sabao.setCategoria(limpeza);
		sabao.setEstoque(estForn03);
		sabao.setObservacao("Sabão de Coco");
		daoProduto.save(sabao);
		
		detergente.setNome("Detergente Ypê");
		detergente.setCategoria(limpeza);
		detergente.setEstoque(estForn03);
		detergente.setObservacao("Detergente Neutro");
		daoProduto.save(detergente);
		
		bombril.setNome("Bom bril");
		bombril.setCategoria(limpeza);
		bombril.setEstoque(estForn03);
		bombril.setObservacao("Esponja de aço");
		daoProduto.save(bombril);
		
		fornecedor03.setNome("Nutriday");
		fornecedor03.setEndereco(endereco03);
		fornecedor03.setEstoque(estForn03);
		daoFornecedor.save(fornecedor03);
		/*----------------------- Teste ----------------------------*/
		Assert.assertTrue(daoFornecedor.findAll().size() == 3);
	}

	@Test
	public void testFindByName()throws RepositoryException {
		/*----------------------------------- Estado -----------------------------*/
		estado.setNome("Paraíba");
		daoEstado.save(estado);
		
		/*------------------------------------ Cidade -----------------------------*/
		cidade.setNome("Mamanguape");
		cidade.setEstado(estado);
		daoCidade.save(cidade);
		
		/*------------------------------------- Endereços -----------------------------*/
		endereco.setCep("58280-000");
		endereco.setLogradouro("Rua da Taboca");
		endereco.setNumero(783);
		endereco.setCidade(cidade);
		daoEndereco.save(endereco);
		
		endereco02.setCep("58280-000");
		endereco02.setLogradouro("Rua da Areia");
		endereco02.setNumero(100);
		endereco02.setCidade(cidade);
		daoEndereco.save(endereco02);
		
		endereco03.setCep("58280-000");
		endereco03.setLogradouro("Rua do Imperador");
		endereco03.setNumero(50);
		endereco03.setCidade(cidade);
		daoEndereco.save(endereco03);
		
		/*----------------------------------------- Estoque -----------------------------*/
		estForn.setNome("Estoque Martins");
		daoEstoque.save(estForn);
		
		estForn02.setNome("Estoque Nordece");
		daoEstoque.save(estForn02);
		
		estForn03.setNome("Estoque Nutriday");
		daoEstoque.save(estForn03);
		
		/*------------------------------------------ Categorias -----------------------------------------------*/
		alimentos.setNome("Alimentos");
		daoCategoria.save(alimentos);
		
		bebidas.setNome("Bebidas");
		daoCategoria.save(bebidas);
		
		limpeza.setNome("Limpeza");
		daoCategoria.save(limpeza);
		
		
		/*------------------------------------------ Fornecedor Martins (Alimentos) -----------------------------*/
		arroz.setNome("Arroz Olivo - 1kg");
		arroz.setCategoria(alimentos);
		arroz.setEstoque(estForn);
		arroz.setObservacao("Parbolizado");
		daoProduto.save(arroz);
		
		feijao.setNome("Boa Safra - 1kg");
		feijao.setCategoria(alimentos);
		feijao.setEstoque(estForn);
		feijao.setObservacao("Preto");
		daoProduto.save(feijao);
		
		macarrao.setNome("Adria - 500g");
		macarrao.setCategoria(alimentos);
		macarrao.setEstoque(estForn);
		macarrao.setObservacao("Espaguete");
		daoProduto.save(macarrao);
		
		
		fornecedor.setNome("Distribuidora Martins Ltda");
		fornecedor.setEndereco(endereco);// rua da taboca
		fornecedor.setEstoque(estForn);//Estoque Martins
		daoFornecedor.save(fornecedor);
		
		/*------------------------------------------Fornecedor Nordece (Bebidas)--------------------*/
		coca.setNome("Coca Cola");
		coca.setCategoria(bebidas);
		coca.setEstoque(estForn02);
		coca.setObservacao("2 Litros");
		daoProduto.save(coca);
		
		fanta.setNome("Fanta Laranja");
		fanta.setCategoria(bebidas);
		fanta.setEstoque(estForn02);
		fanta.setObservacao("1 Litro");
		daoProduto.save(fanta);
		
		pepsi.setNome("Pepsi Twist");
		pepsi.setCategoria(bebidas);
		pepsi.setEstoque(estForn02);
		pepsi.setNome("500 ml");
		pepsi.setObservacao("500 ml");
		daoProduto.save(pepsi);
		
		fornecedor02.setNome("Nordece");
		fornecedor02.setEndereco(endereco02);//rua da Areia
		fornecedor02.setEstoque(estForn02);//Estoque Nordece
		daoFornecedor.save(fornecedor02);
		
		/*------------------------------------------Fornecedor Nutriday (Limpeza)--------------------*/
		sabao.setNome("Sabão Ypê");
		sabao.setCategoria(limpeza);
		sabao.setEstoque(estForn03);
		sabao.setObservacao("Sabão de Coco");
		daoProduto.save(sabao);
		
		detergente.setNome("Detergente Ypê");
		detergente.setCategoria(limpeza);
		detergente.setEstoque(estForn03);
		detergente.setObservacao("Detergente Neutro");
		daoProduto.save(detergente);
		
		bombril.setNome("Bom bril");
		bombril.setCategoria(limpeza);
		bombril.setEstoque(estForn03);
		bombril.setObservacao("Esponja de aço");
		daoProduto.save(bombril);
		
		fornecedor03.setNome("Nutriday");
		fornecedor03.setEndereco(endereco03);
		fornecedor03.setEstoque(estForn03);
		daoFornecedor.save(fornecedor03);
		/*----------------------- Teste ----------------------------*/
		Assert.assertTrue(daoFornecedor.findByName("Nutriday").equals(fornecedor03));
	}

	
}
