package com.springboot.mohan.web_socket;

public class HelloMessage {
  String message;
  

public HelloMessage(String message) {
	super();
	this.message = message;
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}
  
}
