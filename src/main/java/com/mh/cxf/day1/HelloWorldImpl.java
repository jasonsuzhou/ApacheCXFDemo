package com.mh.cxf.day1;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(endpointInterface = "com.mh.cxf.day1.HelloWorld", serviceName = "HelloWorld")
public class HelloWorldImpl implements HelloWorld {
	Map<Integer, User> users = new LinkedHashMap<Integer, User>();

	public String sayHi(@WebParam(name = "text") String text) {
		System.out.println("come in sayHi");
		return "Hello, " + text;
	}

	public String sayHiToUser(User user) {
		System.out.println("come in sayHiToUser");
		users.put(users.size() + 1, user);
		return "Hello, " + user.getName();
	}

	@Override
	public Map<Integer, User> getUsers() {
		System.out.println("come in getUsers");
		return users;
	}

}
