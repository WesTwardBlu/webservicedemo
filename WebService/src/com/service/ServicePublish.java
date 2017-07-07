package com.service;

import javax.xml.ws.Endpoint;

public class ServicePublish {
	public static void main(String[] args) {
		ServiceHello serviceHello= new ServiceHello();
		Endpoint.publish("http://192.168.1.104:9001/Service/ServiceHello", serviceHello);
		System.out.println("publish   success");
	}
}
