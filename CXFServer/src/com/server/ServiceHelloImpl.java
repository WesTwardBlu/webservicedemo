package com.server;

import javax.jws.WebService;

@WebService(endpointInterface="com.server.ServiceHello",serviceName="ServiceHelloImpl",targetNamespace="http://service.yao.com/")
public class ServiceHelloImpl implements ServiceHello {

	@Override
	public String say(String name) {
		return "Ä½¿ÎÍø£º"+ name;
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int sub(int c, int d) {
		// TODO Auto-generated method stub
		return c-d;
	}

}
