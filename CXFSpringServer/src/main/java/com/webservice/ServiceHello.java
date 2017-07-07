package com.webservice;

import javax.jws.WebService;

@WebService
public interface ServiceHello {
	
	String say(String name);
	
}
