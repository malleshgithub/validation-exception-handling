package com.boot.validation_exception.exception;

public class UserNotFoundException extends Exception{

	public UserNotFoundException(String message) {
		super(message);
	}
}
