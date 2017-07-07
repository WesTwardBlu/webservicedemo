package com.server;

import javax.xml.ws.Endpoint;

public class ServicePublish {
	public static void main(String[] args) {
		ServiceHello serviceHello= new ServiceHelloImpl();
		Endpoint.publish("http://localhost:9001/cxfservice/ServiceHello", serviceHello);
		System.out.println("publish success");
		
	}
}	
