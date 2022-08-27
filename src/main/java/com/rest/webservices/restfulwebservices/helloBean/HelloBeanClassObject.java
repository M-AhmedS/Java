package com.rest.webservices.restfulwebservices.helloBean;

public class HelloBeanClassObject {

	private String message;
	
	public HelloBeanClassObject(String message) {
		// TODO Auto-generated constructor stub
	this.message = message;	
	}

	
	public String getMessage() {
		return message;
	}


//	public void setMessage(String message) {
//		this.message = message;
//	}

	@Override
	public String toString() {
		return String.format("HelloBeanClassObject [message=%s]", message);
	}

	
}
