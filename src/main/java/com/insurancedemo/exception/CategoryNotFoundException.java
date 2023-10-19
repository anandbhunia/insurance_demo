package com.insurancedemo.exception;

public class CategoryNotFoundException extends RuntimeException {

	private String msg;

	public CategoryNotFoundException(String msg) {
		super(msg);
		this.msg = msg;
	}
	
}
