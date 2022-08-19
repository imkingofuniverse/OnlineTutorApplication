package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.exception.TutorNotFoundException;

public class TutorControllerAdvice {
	
	@ExceptionHandler (TutorNotFoundException.class)
	public ResponseEntity<String> TutorNotFoundExceptionHandler(TutorNotFoundException e){
	return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);

	}

}
