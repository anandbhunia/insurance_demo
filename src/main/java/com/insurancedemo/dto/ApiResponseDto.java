package com.insurancedemo.dto;

import org.springframework.http.HttpStatus;

public class ApiResponseDto {

	private String message;
	private HttpStatus status;

	public ApiResponseDto(String message, HttpStatus status) {
		this.message = message;
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public HttpStatus getStatus() {
		return status;
	}

}
