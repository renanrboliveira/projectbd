package com.projectbd.dao;

import java.util.List;

/**
 * @author Renan Oliveira 
 * */

public interface GenericDao<T> {
	public void save(T entity)  throws RepositoryException;

	public void delete(T entity);

	public void update(T entity);

	public T findId(int entityID);
	
	public List<T> findAll();
	
	public T findByName(String name);
}
