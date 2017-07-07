package com.webservice;

import javax.jws.WebService;

@WebService(endpointInterface="com.webservice.ServiceHello",serviceName="ServiceHello")
public class ServiceHelloImpl implements ServiceHello{

	@Override
	public String say(String name) {
		// TODO Auto-generated method stub
		return "spring_cxf:"+ name;
	}

}
