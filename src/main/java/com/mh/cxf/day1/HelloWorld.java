package com.mh.cxf.day1;

import java.util.Map;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
@WebService
public interface HelloWorld {
	
	String sayHi(@WebParam(name="text") String text);
	
	String sayHiToUser(User user);

	@XmlJavaTypeAdapter(IntegerUserMapAdapter.class)
	Map<Integer, User> getUsers();
	
}
