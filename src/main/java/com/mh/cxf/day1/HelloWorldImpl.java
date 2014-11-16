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
		String retVal = "";
		System.out.println("come in sayHiToUser");
		if (null == user) {
			retVal = "Error: user object is null";
		} else {
			try {
				System.out.println("Sleep 3 seconds before return");
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		users.put(users.size() + 1, user);
		retVal = "Hello, " + user.getName();
		return retVal;
	}

	@Override
	public Map<Integer, User> getUsers() {
		System.out.println("come in getUsers");
		return users;
	}

}
