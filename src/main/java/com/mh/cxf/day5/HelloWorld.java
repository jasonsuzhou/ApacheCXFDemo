package com.mh.cxf.day5;

import javax.jws.WebParam;

public interface HelloWorld {
	
	public String sayHi(@WebParam(name="name") String name);

}
