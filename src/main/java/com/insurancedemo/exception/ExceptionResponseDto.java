package com.insurancedemo.exception;

import org.springframework.http.HttpStatus;

public class ExceptionResponseDto {

	private final String msg;
	private final Throwable throwable;
	private final HttpStatus status;

	public ExceptionResponseDto(String msg, Throwable throwable, HttpStatus status) {
		this.msg = msg;
		this.throwable = throwable;
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public Throwable getThrowable() {
		return throwable;
	}

	public HttpStatus getStatus() {
		return status;
	}

}
