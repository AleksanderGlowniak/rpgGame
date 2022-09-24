package com.eclipse.ec.services.exceptions;

public class ToShortWarriorNameException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String ERROR_MESSAGE = "name is too short";
	
	public ToShortWarriorNameException() {
		super(ERROR_MESSAGE);
	}

}
