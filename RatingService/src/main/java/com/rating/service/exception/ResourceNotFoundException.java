package com.rating.service.exception;

public class ResourceNotFoundException extends RuntimeException{

	public ResourceNotFoundException() {
		super("rating not fond");
	}
	
	public ResourceNotFoundException(String message) {
		super(message);
	}
}
