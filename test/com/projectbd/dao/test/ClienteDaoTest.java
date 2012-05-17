package com.projectbd.dao.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;

import com.projectbd.dao.ClienteDao;
import com.projectbd.dao.RepositoryException;
import com.projectbd.entity.Cliente;

public class ClienteDaoTest {

	private ClienteDao clienteDao;
	private Cliente cliente;

	@Before
	public void setUp() throws Exception {

		clienteDao = new ClienteDao();

	}

	@Test(expected=RepositoryException.class)
	public void criarClienteTest() throws RepositoryException {
		cliente = new Cliente();
		cliente.setNome("Test");		
		clienteDao.save(cliente);
		
		//Assert.assertEquals(clienteDao.findByName("Test").getNome(), cliente.getNome());
		
		//clienteDao.delete(clienteDao.findByName("Test"));
		
	}

	@Ignore
	public void alterarClienteTest() {
		// TODO Auto-generated method stub

	}

	@Ignore
	public void removerClienteTest() {
		// TODO Auto-generated method stub

	}

	@Ignore
	public void buscarClientePorID() {
		// TODO Auto-generated method stub

	}

	@Ignore
	public void buscarClientePorNome() {
		// TODO Auto-generated method stub

	}

}
