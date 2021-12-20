package com.example.demo.exception;

public class ResourceNotFoundException extends RuntimeException{
	private static final long serialVersionUID = -4798965926484615958L;
	public ResourceNotFoundException(String errorMessage) {
		super(errorMessage);
	}
	

}
