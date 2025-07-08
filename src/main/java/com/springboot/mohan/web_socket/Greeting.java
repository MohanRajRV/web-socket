package com.springboot.mohan.web_socket;

public class Greeting {
	
	 public Greeting(String message) {
		super();
		this.message = message;
	}

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
