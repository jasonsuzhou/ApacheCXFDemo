package com.mh.cxf.day4;

import java.net.URL;
import java.util.concurrent.ExecutionException;

import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;

public class MainCallback {
	public static void main(String[] args) throws Exception {
		URL wsdlLocation = new URL("http://localhost:9000/helloWorld?wsdl");
		HelloWorld helloWorld = new HelloWorldService(wsdlLocation)
				.getHelloWorldPort();
		User user = new User();
		user.setName("jason");
		helloWorld.sayHiToUserAsync(user, new SayHiToUserAsyncHandler());
	}
}

/**
 * define the call back class
 * 
 * @author jasonyao
 * 
 */
class SayHiToUserAsyncHandler implements AsyncHandler<SayHiToUserResponse> {
	SayHiToUserResponse reply = null;

	@Override
	public void handleResponse(Response<SayHiToUserResponse> res) {
		try {
			reply = res.get();
			System.out.println(reply.getReturn());
		} catch (ExecutionException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public String getResponseText() {
		return reply.getReturn();
	}

}
