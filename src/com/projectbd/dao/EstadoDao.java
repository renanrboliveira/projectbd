package com.projectbd.dao;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.projectbd.entity.Estado;

public class EstadoDao extends GenericDaoImpl<Estado>{

	public EstadoDao() {
		super(Estado.class);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Estado> findAll() {
		return getEntityManager().createQuery("SELECT est FROM Estado est").getResultList();
	}

	@Override
	public Estado findByName(String name) {
		return (Estado) getEntityManager().createQuery("SELECT e FROM Estado e  WHERE nome = ?1 ", Estado.class)
				.setParameter(1, name).getResultList().get(0);
	}
	
	public Estado buscarPorNome(String name){
		
		CriteriaBuilder criterio = getEntityManager().getCriteriaBuilder();
		CriteriaQuery<Estado> query = criterio.createQuery(Estado.class);
		Root<Estado> tabelaEstado = query.from(Estado.class);

		Path<String> nome = tabelaEstado.get("nome");

		Predicate condicao = criterio.like(nome, name);

		query.select(tabelaEstado).where(condicao);

		TypedQuery<Estado> typedQuery = getEntityManager().createQuery(query);
		return typedQuery.getSingleResult();
	}
	
	public Estado buscarPorNome2(String name){
		String query = "SELECT e " + 
                "FROM Estado e " + 
                "WHERE e.nome = '" + name + "'";  
        
		return getEntityManager().createQuery(query, Estado.class).getResultList().get(0); 
	}

}
