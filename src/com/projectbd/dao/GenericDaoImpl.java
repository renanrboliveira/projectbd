package com.projectbd.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.projectbd.util.HibernateUtil;

/**
 * @author Paulo Antonio
 * @author Renan Oliveira
 */
public abstract class GenericDaoImpl<T> {

	private EntityManager entityManager;
	private Class<T> entityClass;

	public GenericDaoImpl(Class<T> entityClass) {
		entityManager = HibernateUtil.getInstance().getFactory()
				.createEntityManager();
		this.entityClass = entityClass;
	}

	public void save(T entity) throws RepositoryException {
		try {
			
			entityManager.getTransaction().begin();
			entityManager.persist(entity);
			entityManager.getTransaction().commit();
			
		} catch (Exception e) {			
			entityManager.getTransaction().rollback();
			throw new RepositoryException("Error save: "+e.getMessage());
		}	
	}

	public void delete(T entity) {
		entityManager.getTransaction().begin();
		entityManager.remove(entity);
		entityManager.getTransaction().commit();
	}

	public void update(T entity) {
		entityManager.getTransaction().begin();
		entityManager.merge(entity);
		entityManager.getTransaction().commit();
	}

	public T findId(int entityID) {
		return entityManager.find(entityClass, entityID);
	}
	
	public abstract List<T> findAll();
	
	public abstract T findByName(String name);

	public EntityManager getEntityManager() {
		return entityManager;
	}
}