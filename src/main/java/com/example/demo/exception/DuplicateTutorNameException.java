package com.example.demo.exception;

public class DuplicateTutorNameException extends Exception{
	
	private static final long serialVersionUID = 4840764544432773915L;
	
	public DuplicateTutorNameException(String s) {
		super(s);
	}

}
