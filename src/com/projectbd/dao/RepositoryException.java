package com.projectbd.dao;


/**
 * @author Renan Oliveira
 */
public class RepositoryException extends Exception {
	private static final long serialVersionUID = -7164404239705038828L;
	

	public RepositoryException() {
		super();
	}

	public RepositoryException(String message, Throwable cause) {
		super(message, cause);
	}

	public RepositoryException(String message) {
		super(message);
	}

	public RepositoryException(Throwable cause) {
		super(cause);
	}

	
}
