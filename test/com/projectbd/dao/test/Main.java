package com.projectbd.dao.test;

import com.projectbd.dao.RepositoryException;
import com.projectbd.dao.UsuarioDao;
import com.projectbd.entity.Usuario;

public class Main {
	public static void main(String args[]){
		Usuario usuario = new Usuario();
		usuario.setNome("Paulo");
		usuario.setLogin("123");
		usuario.setSenha("123");
		UsuarioDao dao = new UsuarioDao();
		
		try {
			dao.save(usuario);
		} catch (RepositoryException e) {
			System.out.println(e.getMessage());
		}
	}

}
