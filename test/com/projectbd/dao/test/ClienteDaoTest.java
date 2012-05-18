package com.projectbd.dao.test;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;

import com.projectbd.dao.CidadeDao;
import com.projectbd.dao.ClienteDao;
import com.projectbd.dao.EnderecoDao;
import com.projectbd.dao.EstadoDao;
import com.projectbd.dao.RepositoryException;
import com.projectbd.entity.Cidade;
import com.projectbd.entity.Cliente;
import com.projectbd.entity.Endereco;
import com.projectbd.entity.Estado;

public class ClienteDaoTest {
	private Cliente cliente;
	private Cliente cliente02;
	private Cliente cliente03;
	private Estado estado;
	private Cidade cidade;
	private Endereco endereco;
	private Endereco endereco02;
	private Endereco endereco03;
	
	private ClienteDao clienteDao;
	private EstadoDao estadoDao;
	private CidadeDao cidadeDao;
	private EnderecoDao enderecoDao;

	@Before
	public void setUp() throws Exception {
		cliente = new Cliente();
		cliente02 = new Cliente();
		cliente03 = new Cliente();
		estado = new Estado();
		cidade = new Cidade();
		endereco = new Endereco();
		endereco02 = new Endereco();
		endereco03 = new Endereco();
		clienteDao = new ClienteDao();
		estadoDao = new EstadoDao();
		cidadeDao = new CidadeDao();
		enderecoDao = new EnderecoDao();
		
	}

	@Ignore
	public void testSave() throws RepositoryException {
		estado.setNome("Paraíba");
		estadoDao.save(estado);
		
		cidade.setNome("Mamanguape");
		cidade.setEstado(estado);
		cidadeDao.save(cidade);
		
		endereco.setCep("58280-000");
		endereco.setLogradouro("Rua da Taboca");
		endereco.setNumero(783);
		endereco.setCidade(cidade);
		enderecoDao.save(endereco);
		
		endereco02.setCep("58280-000");
		endereco02.setLogradouro("Rua da Areia");
		endereco02.setNumero(100);
		endereco02.setCidade(cidade);
		enderecoDao.save(endereco02);
		
		endereco03.setCep("58280-000");
		endereco03.setLogradouro("Rua do Imperador");
		endereco03.setNumero(50);
		endereco03.setCidade(cidade);
		enderecoDao.save(endereco03);
		
		cliente.setNome("Paulo Neto");
		cliente.setEndereco(endereco);// rua da Taboca
		cliente.setCelular("5555-6666");
		cliente.setEmail("paulo@dce.com");
		cliente.setRg("11111-SSP/PB");
		cliente.setSexo("M");
		cliente.setCnpjCpf("123-4");
		cliente.setTelefone("3333-4444");
		clienteDao.save(cliente);
		
		cliente02.setNome("Renan Oliveira");
		cliente02.setEndereco(endereco02);// rua da Areia
		cliente02.setCelular("3333-4444");
		cliente02.setEmail("renan@dce.com");
		cliente02.setRg("22222-SSP/PB");
		cliente02.setSexo("M");
		cliente02.setCnpjCpf("567-8");
		cliente02.setTelefone("6666-7777");
		clienteDao.save(cliente02);
		
		cliente03.setNome("Rodrigo Vilar");
		cliente03.setEndereco(endereco03);// rua do Imperador
		cliente03.setCelular("9999-8888");
		cliente03.setEmail("rodrigo@dce.com");
		cliente03.setRg("33333-SSP/PB");
		cliente03.setSexo("M");
		cliente03.setCnpjCpf("435-7");
		cliente03.setTelefone("2222-7777");
		clienteDao.save(cliente03);
		
		Assert.assertEquals(3,clienteDao.findAll().size());
		Assert.assertTrue(clienteDao.findId(3).getEndereco().getLogradouro().equals("Rua do Imperador"));	
	}

	@Ignore
	public void testUpdate()throws RepositoryException {
		estado.setNome("Paraíba");
		estadoDao.save(estado);
		
		cidade.setNome("Mamanguape");
		cidade.setEstado(estado);
		cidadeDao.save(cidade);
		
		endereco.setCep("58280-000");
		endereco.setLogradouro("Rua da Taboca");
		endereco.setNumero(783);
		endereco.setCidade(cidade);
		enderecoDao.save(endereco);
		
		endereco02.setCep("58280-000");
		endereco02.setLogradouro("Rua da Areia");
		endereco02.setNumero(100);
		endereco02.setCidade(cidade);
		enderecoDao.save(endereco02);
		
		endereco03.setCep("58280-000");
		endereco03.setLogradouro("Rua do Imperador");
		endereco03.setNumero(50);
		endereco03.setCidade(cidade);
		enderecoDao.save(endereco03);
		
		cliente.setNome("Paulo Neto");
		cliente.setEndereco(endereco);// rua da Taboca
		cliente.setCelular("5555-6666");
		cliente.setEmail("paulo@dce.com");
		cliente.setRg("11111-SSP/PB");
		cliente.setSexo("M");
		cliente.setCnpjCpf("123-4");
		cliente.setTelefone("3333-4444");
		clienteDao.save(cliente);
		
		cliente02.setNome("Renan Oliveira");
		cliente02.setEndereco(endereco02);// rua da Areia
		cliente02.setCelular("3333-4444");
		cliente02.setEmail("renan@dce.com");
		cliente02.setRg("22222-SSP/PB");
		cliente02.setSexo("M");
		cliente02.setCnpjCpf("567-8");
		cliente02.setTelefone("6666-7777");
		clienteDao.save(cliente02);
		
		cliente03.setNome("Rodrigo Vilar");
		cliente03.setEndereco(endereco03);// rua do Imperador
		cliente03.setCelular("9999-8888");
		cliente03.setEmail("rodrigo@dce.com");
		cliente03.setRg("33333-SSP/PB");
		cliente03.setSexo("M");
		cliente03.setCnpjCpf("435-7");
		cliente03.setTelefone("2222-7777");
		clienteDao.save(cliente03);
		
		cliente02.setEndereco(endereco03);
		
		clienteDao.update(cliente02);
		
		Assert.assertTrue(clienteDao.findByName("Renan Oliveira").getEndereco().getLogradouro().equals("Rua do Imperador"));

	}

	@Ignore
	public void testDelete()throws RepositoryException {
		estado.setNome("Paraíba");
		estadoDao.save(estado);
		
		cidade.setNome("Mamanguape");
		cidade.setEstado(estado);
		cidadeDao.save(cidade);
		
		endereco.setCep("58280-000");
		endereco.setLogradouro("Rua da Taboca");
		endereco.setNumero(783);
		endereco.setCidade(cidade);
		enderecoDao.save(endereco);
		
		endereco02.setCep("58280-000");
		endereco02.setLogradouro("Rua da Areia");
		endereco02.setNumero(100);
		endereco02.setCidade(cidade);
		enderecoDao.save(endereco02);
		
		endereco03.setCep("58280-000");
		endereco03.setLogradouro("Rua do Imperador");
		endereco03.setNumero(50);
		endereco03.setCidade(cidade);
		enderecoDao.save(endereco03);
		
		cliente.setNome("Paulo Neto");
		cliente.setEndereco(endereco);// rua da Taboca
		cliente.setCelular("5555-6666");
		cliente.setEmail("paulo@dce.com");
		cliente.setRg("11111-SSP/PB");
		cliente.setSexo("M");
		cliente.setCnpjCpf("123-4");
		cliente.setTelefone("3333-4444");
		clienteDao.save(cliente);
		
		cliente02.setNome("Renan Oliveira");
		cliente02.setEndereco(endereco02);// rua da Areia
		cliente02.setCelular("3333-4444");
		cliente02.setEmail("renan@dce.com");
		cliente02.setRg("22222-SSP/PB");
		cliente02.setSexo("M");
		cliente02.setCnpjCpf("567-8");
		cliente02.setTelefone("6666-7777");
		clienteDao.save(cliente02);
		
		cliente03.setNome("Rodrigo Vilar");
		cliente03.setEndereco(endereco03);// rua do Imperador
		cliente03.setCelular("9999-8888");
		cliente03.setEmail("rodrigo@dce.com");
		cliente03.setRg("33333-SSP/PB");
		cliente03.setSexo("M");
		cliente03.setCnpjCpf("435-7");
		cliente03.setTelefone("2222-7777");
		clienteDao.save(cliente03);
		
		clienteDao.delete(cliente);
		
		Assert.assertFalse(clienteDao.findAll().contains(cliente));	
	}

	@Ignore
	public void testFindId()throws RepositoryException {
		estado.setNome("Paraíba");
		estadoDao.save(estado);
		
		cidade.setNome("Mamanguape");
		cidade.setEstado(estado);
		cidadeDao.save(cidade);
		
		endereco.setCep("58280-000");
		endereco.setLogradouro("Rua da Taboca");
		endereco.setNumero(783);
		endereco.setCidade(cidade);
		enderecoDao.save(endereco);
		
		endereco02.setCep("58280-000");
		endereco02.setLogradouro("Rua da Areia");
		endereco02.setNumero(100);
		endereco02.setCidade(cidade);
		enderecoDao.save(endereco02);
		
		endereco03.setCep("58280-000");
		endereco03.setLogradouro("Rua do Imperador");
		endereco03.setNumero(50);
		endereco03.setCidade(cidade);
		enderecoDao.save(endereco03);
		
		cliente.setNome("Paulo Neto");
		cliente.setEndereco(endereco);// rua da Taboca
		cliente.setCelular("5555-6666");
		cliente.setEmail("paulo@dce.com");
		cliente.setRg("11111-SSP/PB");
		cliente.setSexo("M");
		cliente.setCnpjCpf("123-4");
		cliente.setTelefone("3333-4444");
		clienteDao.save(cliente);
		
		cliente02.setNome("Renan Oliveira");
		cliente02.setEndereco(endereco02);// rua da Areia
		cliente02.setCelular("3333-4444");
		cliente02.setEmail("renan@dce.com");
		cliente02.setRg("22222-SSP/PB");
		cliente02.setSexo("M");
		cliente02.setCnpjCpf("567-8");
		cliente02.setTelefone("6666-7777");
		clienteDao.save(cliente02);
		
		cliente03.setNome("Rodrigo Vilar");
		cliente03.setEndereco(endereco03);// rua do Imperador
		cliente03.setCelular("9999-8888");
		cliente03.setEmail("rodrigo@dce.com");
		cliente03.setRg("33333-SSP/PB");
		cliente03.setSexo("M");
		cliente03.setCnpjCpf("435-7");
		cliente03.setTelefone("2222-7777");
		clienteDao.save(cliente03);
		
		Assert.assertEquals(clienteDao.findId(1).getNome(),"Paulo Neto");
	}

	@Ignore
	public void testFindByName()throws RepositoryException {
		estado.setNome("Paraíba");
		estadoDao.save(estado);
		
		cidade.setNome("Mamanguape");
		cidade.setEstado(estado);
		cidadeDao.save(cidade);
		
		endereco.setCep("58280-000");
		endereco.setLogradouro("Rua da Taboca");
		endereco.setNumero(783);
		endereco.setCidade(cidade);
		enderecoDao.save(endereco);
		
		endereco02.setCep("58280-000");
		endereco02.setLogradouro("Rua da Areia");
		endereco02.setNumero(100);
		endereco02.setCidade(cidade);
		enderecoDao.save(endereco02);
		
		endereco03.setCep("58280-000");
		endereco03.setLogradouro("Rua do Imperador");
		endereco03.setNumero(50);
		endereco03.setCidade(cidade);
		enderecoDao.save(endereco03);
		
		cliente.setNome("Paulo Neto");
		cliente.setEndereco(endereco);// rua da Taboca
		cliente.setCelular("5555-6666");
		cliente.setEmail("paulo@dce.com");
		cliente.setRg("11111-SSP/PB");
		cliente.setSexo("M");
		cliente.setCnpjCpf("123-4");
		cliente.setTelefone("3333-4444");
		clienteDao.save(cliente);
		
		cliente02.setNome("Renan Oliveira");
		cliente02.setEndereco(endereco02);// rua da Areia
		cliente02.setCelular("3333-4444");
		cliente02.setEmail("renan@dce.com");
		cliente02.setRg("22222-SSP/PB");
		cliente02.setSexo("M");
		cliente02.setCnpjCpf("567-8");
		cliente02.setTelefone("6666-7777");
		clienteDao.save(cliente02);
		
		cliente03.setNome("Rodrigo Vilar");
		cliente03.setEndereco(endereco03);// rua do Imperador
		cliente03.setCelular("9999-8888");
		cliente03.setEmail("rodrigo@dce.com");
		cliente03.setRg("33333-SSP/PB");
		cliente03.setSexo("M");
		cliente03.setCnpjCpf("435-7");
		cliente03.setTelefone("2222-7777");
		clienteDao.save(cliente03);
		
		Assert.assertTrue(clienteDao.findByName("Rodrigo Vilar").getEmail().equals("rodrigo@dce.com"));
	}
	
	@Test
	public void testFindAll()throws RepositoryException{
		estado.setNome("Paraíba");
		estadoDao.save(estado);
		
		cidade.setNome("Mamanguape");
		cidade.setEstado(estado);
		cidadeDao.save(cidade);
		
		endereco.setCep("58280-000");
		endereco.setLogradouro("Rua da Taboca");
		endereco.setNumero(783);
		endereco.setCidade(cidade);
		enderecoDao.save(endereco);
		
		endereco02.setCep("58280-000");
		endereco02.setLogradouro("Rua da Areia");
		endereco02.setNumero(100);
		endereco02.setCidade(cidade);
		enderecoDao.save(endereco02);
		
		endereco03.setCep("58280-000");
		endereco03.setLogradouro("Rua do Imperador");
		endereco03.setNumero(50);
		endereco03.setCidade(cidade);
		enderecoDao.save(endereco03);
		
		cliente.setNome("Paulo Neto");
		cliente.setEndereco(endereco);// rua da Taboca
		cliente.setCelular("5555-6666");
		cliente.setEmail("paulo@dce.com");
		cliente.setRg("11111-SSP/PB");
		cliente.setSexo("M");
		cliente.setCnpjCpf("123-4");
		cliente.setTelefone("3333-4444");
		clienteDao.save(cliente);
		
		cliente02.setNome("Renan Oliveira");
		cliente02.setEndereco(endereco02);// rua da Areia
		cliente02.setCelular("3333-4444");
		cliente02.setEmail("renan@dce.com");
		cliente02.setRg("22222-SSP/PB");
		cliente02.setSexo("M");
		cliente02.setCnpjCpf("567-8");
		cliente02.setTelefone("6666-7777");
		clienteDao.save(cliente02);
		
		cliente03.setNome("Rodrigo Vilar");
		cliente03.setEndereco(endereco03);// rua do Imperador
		cliente03.setCelular("9999-8888");
		cliente03.setEmail("rodrigo@dce.com");
		cliente03.setRg("33333-SSP/PB");
		cliente03.setSexo("M");
		cliente03.setCnpjCpf("435-7");
		cliente03.setTelefone("2222-7777");
		clienteDao.save(cliente03);
		
		Assert.assertTrue(clienteDao.findAll().size() == 3);
	}

}
