package com.mh.cxf.day5;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class HelloWorldImpl implements HelloWorld {

	@Override
	public String sayHi(@WebParam(name = "name") String name) {
		return "Hello, " + name;
	}

}
