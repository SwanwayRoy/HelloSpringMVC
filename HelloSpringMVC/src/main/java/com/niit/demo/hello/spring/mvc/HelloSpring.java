package com.niit.demo.hello.spring.mvc;

public class HelloSpring 
{
	private String message;

	public String getMessage() 
	{
		return message;
	}

	public void setMessage(String message) 
	{
		this.message = message;
	}

	public void displayInfo()
	{
		System.out.println(message);
	}
}