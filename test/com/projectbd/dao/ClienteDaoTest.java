package com.projectbd.dao;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;

import com.projectbd.entity.Cidade;
import com.projectbd.entity.Cliente;
import com.projectbd.entity.Endereco;
import com.projectbd.entity.Estado;

public class ClienteDaoTest {

	private ClienteDao clienteDao;
	private Cliente cliente;
	private Endereco endereco;
	private Cidade cidade;
	private Estado estado;

	@Before
	public void setUp() throws Exception {

		clienteDao = new ClienteDao();

	}

	@Test(expected=RepositoryException.class)
	public void criarClienteTest() throws RepositoryException {
		cidade = new Cidade();
		cidade.setNome("Mamanguape");
		
		estado = new Estado();
		estado.setNome("PB");
		
		cidade.setEstado(estado);
		
		endereco = new Endereco();
		
		endereco.setLogradouro("sei la onde moro");
		endereco.setNumero(22);
		endereco.setCep("55455454");
		
		cliente = new Cliente();
		cliente.setNome("Test");
		cliente.setCelular("11333-23333");
		cliente.setCnpjCpf("22123");
		cliente.setEmail("g@gmail.com");
		cliente.setRg("232333");
		cliente.setEndereco(endereco);
		cliente.setSexo("M");
		cliente.setTelefone("11222");
		
		clienteDao.save(cliente);
		
		Assert.assertEquals(clienteDao.findByName("Test").getNome(), cliente.getNome());
		
		clienteDao.delete(clienteDao.findByName("Test"));
		
	}

	@
	public void alterarClienteTest() {
		// TODO Auto-generated method stub

	}

	@Test
	public void removerClienteTest() {
		// TODO Auto-generated method stub

	}

	@Test
	public void buscarClientePorID() {
		// TODO Auto-generated method stub

	}

	@Test
	public void buscarClientePorNome() {
		// TODO Auto-generated method stub

	}

}
