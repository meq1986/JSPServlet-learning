package com.maeq.jspservlet;

import java.util.HashMap;
import java.util.Map;

public class HelloModel {
	private Map<String,String> messages = new HashMap<String,String>();
	
	public HelloModel()
	{
		messages.put("Max", "hi");
		messages.put("John", "hello");
		messages.put("Java", "hey");
	}
	
	public String doHello(String user){
		String message = messages.get(user);
		return message + ", " + user;
	}
	
}
