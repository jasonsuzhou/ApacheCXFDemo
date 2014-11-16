package com.mh.cxf.day4;

import java.net.URL;
import java.util.concurrent.ExecutionException;

import javax.xml.ws.Response;

public class MainPolling {
	
	public static void main(String[] args) throws Exception {
		URL wsdlLocation = new URL("http://localhost:9000/helloWorld?wsdl");
		HelloWorld helloWorld = new HelloWorldService(wsdlLocation).getHelloWorldPort();
		Response<SayHiResponse> sayHiResponse = helloWorld.sayHiAsync("jason");
		while(!sayHiResponse.isDone()) {
			Thread.sleep(1000);
		}
		
		try {
			SayHiResponse reply = sayHiResponse.get();
			System.out.println(reply.getReturn());
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}

}
