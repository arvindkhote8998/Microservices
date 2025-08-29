package com.rating.service.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionhandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<Map<String,String>> getMessage(ResourceNotFoundException ex){
		Map<String,String> map = new HashMap<>();
		map.put("message", ex.getMessage());
		map.put("status", HttpStatus.NOT_FOUND.toString());
		return (ResponseEntity<Map<String, String>>) map;
	}
}
