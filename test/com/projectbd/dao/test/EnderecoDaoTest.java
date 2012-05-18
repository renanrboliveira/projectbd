package com.projectbd.dao.test;


import junit.framework.Assert;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.projectbd.dao.CidadeDao;
import com.projectbd.dao.EnderecoDao;
import com.projectbd.dao.EstadoDao;
import com.projectbd.dao.RepositoryException;
import com.projectbd.entity.Cidade;
import com.projectbd.entity.Endereco;
import com.projectbd.entity.Estado;

public class EnderecoDaoTest {
	
	private Endereco endereco;
	private Endereco endereco02;
	private Endereco endereco03;
	private Estado estado;
	private Cidade cidade, cidade02, cidade03;
	private CidadeDao daoCidade;
	private EstadoDao daoEstado;
	private EnderecoDao daoEndereco;
	
	@Before
	public void setUp() throws Exception {
		endereco = new Endereco();
		endereco02 = new Endereco();
		endereco03 = new Endereco();
		cidade = new Cidade();
		cidade02 = new Cidade();
		cidade03 = new Cidade();
		daoCidade = new CidadeDao();
		estado = new Estado();
		daoEstado = new EstadoDao();
		daoEndereco = new EnderecoDao();
	}

	
	@Ignore
	public void testSave()throws RepositoryException {
		estado.setNome("Paraíba");
		daoEstado.save(estado);
		
		cidade.setNome("Sapé");
		cidade.setEstado(estado);
		
		cidade02.setNome("Araruna");
		cidade.setEstado(estado);
		
		cidade03.setNome("Jacaraú");
		cidade.setEstado(estado);
		
		daoCidade.save(cidade);
		daoCidade.save(cidade02);
		daoCidade.save(cidade03);
		
		endereco.setCep("58280-000");
		endereco.setCidade(cidade);
		endereco.setLogradouro("Rua Nova");
		endereco.setNumero(783);
		
		daoEndereco.save(endereco);
		
		Assert.assertFalse(daoEndereco.findId(1).equals(cidade));
	}

	@Ignore
	public void testDelete()throws RepositoryException {
		estado.setNome("Paraíba");
		daoEstado.save(estado);
		
		cidade.setNome("Sapé");
		cidade.setEstado(estado);
		
		cidade02.setNome("Araruna");
		cidade.setEstado(estado);
		
		cidade03.setNome("Jacaraú");
		cidade.setEstado(estado);
		
		daoCidade.save(cidade);
		daoCidade.save(cidade02);
		daoCidade.save(cidade03);
		
		endereco.setCep("58280-000");
		endereco.setCidade(cidade);
		endereco.setLogradouro("Rua Nova");
		endereco.setNumero(783);
		
		endereco02.setCep("58290-000");
		endereco02.setCidade(cidade02);
		endereco02.setLogradouro("Rua da Mangueira");
		endereco02.setNumero(200);
		
		endereco03.setCep("58270-000");
		endereco03.setCidade(cidade03);
		endereco03.setLogradouro("Rua da Aurora");
		endereco03.setNumero(200);
		
		daoEndereco.save(endereco);
		daoEndereco.save(endereco02);
		daoEndereco.save(endereco03);
		
		daoEndereco.delete(endereco);
		
		Assert.assertTrue(daoEndereco.findAll().size() == 2);
		
	}

	@Ignore
	public void testUpdate()throws RepositoryException {
		estado.setNome("Paraíba");
		daoEstado.save(estado);
		
		cidade.setNome("Sapé");
		cidade.setEstado(estado);
		
		cidade02.setNome("Araruna");
		cidade.setEstado(estado);
		
		cidade03.setNome("Jacaraú");
		cidade.setEstado(estado);
		
		daoCidade.save(cidade);
		daoCidade.save(cidade02);
		daoCidade.save(cidade03);
		
		endereco.setCep("58280-000");
		endereco.setCidade(cidade);
		endereco.setLogradouro("Rua Nova");
		endereco.setNumero(783);
		
		endereco02.setCep("58290-000");
		endereco02.setCidade(cidade02);
		endereco02.setLogradouro("Rua da Mangueira");
		endereco02.setNumero(200);
		
		endereco03.setCep("58270-000");
		endereco03.setCidade(cidade03);
		endereco03.setLogradouro("Rua da Aurora");
		endereco03.setNumero(200);
		
		daoEndereco.save(endereco);
		daoEndereco.save(endereco02);
		daoEndereco.save(endereco03);
		
		endereco02.setNumero(400);
		
		daoEndereco.update(endereco02);
		
		Assert.assertEquals(200,daoEndereco.findId(2).getNumero());
	}

	@Ignore
	public void testFindId()throws RepositoryException {
		estado.setNome("Paraíba");
		daoEstado.save(estado);
		
		cidade.setNome("Sapé");
		cidade.setEstado(estado);
		
		cidade02.setNome("Araruna");
		cidade.setEstado(estado);
		
		cidade03.setNome("Jacaraú");
		cidade.setEstado(estado);
		
		daoCidade.save(cidade);
		daoCidade.save(cidade02);
		daoCidade.save(cidade03);
		
		endereco.setCep("58280-000");
		endereco.setCidade(cidade);
		endereco.setLogradouro("Rua Nova");
		endereco.setNumero(783);
		
		endereco02.setCep("58290-000");
		endereco02.setCidade(cidade02);
		endereco02.setLogradouro("Rua da Mangueira");
		endereco02.setNumero(200);
		
		endereco03.setCep("58270-000");
		endereco03.setCidade(cidade03);
		endereco03.setLogradouro("Rua da Aurora");
		endereco03.setNumero(200);
		
		daoEndereco.save(endereco);
		daoEndereco.save(endereco02);
		daoEndereco.save(endereco03);
		
		Assert.assertTrue("ERRO : 'Id' errado",daoEndereco.findId(3).equals(endereco03));	
	}
	
	@Ignore
	public void testFindAll()throws RepositoryException {
		estado.setNome("Paraíba");
		daoEstado.save(estado);
		
		cidade.setNome("Sapé");
		cidade.setEstado(estado);
		
		cidade02.setNome("Araruna");
		cidade.setEstado(estado);
		
		cidade03.setNome("Jacaraú");
		cidade.setEstado(estado);
		
		daoCidade.save(cidade);
		daoCidade.save(cidade02);
		daoCidade.save(cidade03);
		
		endereco.setCep("58280-000");
		endereco.setCidade(cidade);
		endereco.setLogradouro("Rua Nova");
		endereco.setNumero(783);
		
		endereco02.setCep("58290-000");
		endereco02.setCidade(cidade02);
		endereco02.setLogradouro("Rua da Mangueira");
		endereco02.setNumero(200);
		
		endereco03.setCep("58270-000");
		endereco03.setCidade(cidade03);
		endereco03.setLogradouro("Rua da Aurora");
		endereco03.setNumero(200);
		
		daoEndereco.save(endereco);
		daoEndereco.save(endereco02);
		daoEndereco.save(endereco03);
		
		Assert.assertTrue(daoEndereco.findAll().contains(endereco02));
	}

	@Test
	public void testFindByName()throws RepositoryException {
		estado.setNome("Paraíba");
		daoEstado.save(estado);
		
		cidade.setNome("Sapé");
		cidade.setEstado(estado);
		
		cidade02.setNome("Araruna");
		cidade.setEstado(estado);
		
		cidade03.setNome("Jacaraú");
		cidade.setEstado(estado);
		
		daoCidade.save(cidade);
		daoCidade.save(cidade02);
		daoCidade.save(cidade03);
		
		endereco.setCep("58280-000");
		endereco.setCidade(cidade);
		endereco.setLogradouro("Rua Nova");
		endereco.setNumero(783);
		
		endereco02.setCep("58290-000");
		endereco02.setCidade(cidade02);
		endereco02.setLogradouro("Rua da Mangueira");
		endereco02.setNumero(200);
		
		endereco03.setCep("58270-000");
		endereco03.setCidade(cidade03);
		endereco03.setLogradouro("Rua da Aurora");
		endereco03.setNumero(200);
		
		daoEndereco.save(endereco);
		daoEndereco.save(endereco02);
		daoEndereco.save(endereco03);
		
		Assert.assertFalse(daoEndereco.findByName("58270-000").getCidade().getNome().equals(cidade));
		
	}
}
