package com.project.paymentt.Exception;

public class EntityNotFoundException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;

	public EntityNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EntityNotFoundException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}



}
