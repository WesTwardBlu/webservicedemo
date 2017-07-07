package com.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class CxfTest {
	public static void main(String[] args) {
		ServiceHello serviceHello= getServiceHello();
		System.out.println(serviceHello.say("cyan"));
	}
	
	public static ServiceHello getServiceHello() {
		JaxWsProxyFactoryBean factoryBean= new JaxWsProxyFactoryBean();
		factoryBean.setServiceClass(ServiceHello.class);
		factoryBean.setAddress("http://localhost:8091/CXFSpringServer/webservice/serviceHello?wsdl");
		return (ServiceHello) factoryBean.create();
	}
	
	
}
