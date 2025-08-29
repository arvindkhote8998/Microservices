package com.hotel.service.exception;

public class ResourceNotFoundException extends RuntimeException{

	public ResourceNotFoundException(String message) {
		super(message);
	}
	public ResourceNotFoundException() {
		super("Hotel Not found");
	}
}
